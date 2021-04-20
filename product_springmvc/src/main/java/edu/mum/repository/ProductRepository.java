package edu.mum.repository;

import java.util.List;
import java.util.Optional;

import edu.mum.domain.Category;
import edu.mum.domain.Product;

 public interface ProductRepository   {
	
 
	
	public List<Product> getAll();
	
	public void save(Product product);

	 public Optional<Product> findById(int id);
	
}
 
