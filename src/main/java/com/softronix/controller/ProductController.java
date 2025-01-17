package com.softronix.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softronix.entity.Product;
import com.softronix.service.ProductService;

@RestController
public class ProductController {
@Autowired
	ProductService service;
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product)
	{
		return service.addPro(product);
	}
	@GetMapping("/getPros")
	public List<Product>getProduct(){
		return service.getPros();
		
	}
	@GetMapping("/getPro/{id}")
	public Product getPro(@PathVariable int id) {
		return service.getProId(id);
	}
	@DeleteMapping("/delete/{id}")
	public String dele(@PathVariable int id){
		return service.delPro(id);
		
		
	}
	@PutMapping("/update")
	public Product updPro(@RequestBody Product product){
		return service.upPro(product);
		
	}
}
