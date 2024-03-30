package com.mcdonald.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/saveproducts")
	public List<Product> saveHospitals(@RequestBody List<Product> products){
		
		return productService.saveProducts(products);
		
	}
	
	@PostMapping("/saveproduct")
	public Product saveHospital(@RequestBody Product product){
		
		return productService.saveProduct(product);
		
	}
	@GetMapping("/getall")
	public List<Product> getAllProducts(){
		return productService.getAll();
	}
	
}