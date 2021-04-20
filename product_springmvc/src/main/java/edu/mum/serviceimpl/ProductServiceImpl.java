package edu.mum.serviceimpl;

import java.util.List;
import java.util.Optional;

import edu.mum.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.Product;
import edu.mum.repository.ProductRepository;
import edu.mum.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Product> getAll() {
		return productRepository.getAll();
	}

	public void save(Product product) {
		productRepository.save(product);
	}

	@Override
	public Product findProductById(int id) {
		Optional<Product> optionalProduct = productRepository.findById(id);

		if (optionalProduct.isPresent()){
			return optionalProduct.get();
		}
		return null;
	}

}
