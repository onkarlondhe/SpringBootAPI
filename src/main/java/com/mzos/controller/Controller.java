package com.mzos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mzos.bean.Product;
import com.mzos.service.Service;

@RestController
public class Controller {
	@Autowired
	Service service;
	
	@GetMapping("/products")
	public List<Product> showAllProduct(){
		return service.getAllProduct();
	}
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product pro) {
		return service.insertProduct(pro);
	}
	
	@PutMapping("/updateProduct")
	public Product changeProductDetails(@RequestBody Product pro) {
		return service.updateProduct(pro);
	}
	
	@DeleteMapping("/deleteproduct/{proId}")
	public boolean removeProduct(@PathVariable int proId) {
		return service.deleteProduct(proId);
	}
	
}
