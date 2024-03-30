package com.mcdonald.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductRepository projectRepository;

	public List<Product> saveProducts(List<Product> products) {
		
		return projectRepository.saveAll(products);
	}

	public Product saveProduct(Product product) {
		
		return projectRepository.save(product);
	}

	public List<Product> getAll() {
		
		return projectRepository.findAll();
	}
	
}
