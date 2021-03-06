package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import edu.mum.domain.Category;
import edu.mum.domain.Product;
import edu.mum.service.CategoryService;
import edu.mum.service.ProductService;

@RequestMapping("/product")
@Controller
public class ProductController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductService productService;

	@GetMapping()
	public String getProductForm(Model model) {
		// TODO implementation...
		model.addAttribute("categories", categoryService.getAll());
		return "ProductForm";
	}


	@PostMapping()
	public String saveProduct(Product product) {
		System.out.println(product);

		Category category = categoryService.getCategory(product.getCategory().getId());
		product.setCategory(category);


		productService.save(product);
		return "ProductDetails";
	}

	@GetMapping("/listproducts")
	public String listProducts(Model model) {
		// TODO implementation...
		model.addAttribute("products", productService.getAll());
		return "ListProducts";
	}


	@RequestMapping("/productfind")
	public String findProduct(Model model, @RequestParam(required = false) Integer id) {
		// TODO
		if (id == null) return "Find";

		Product product = productService.findProductById(id);
		model.addAttribute("product", product);
		return "SingleProduct";
	}
}
