package com.mzos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mzos.bean.Product;
import com.mzos.repository.IRepo;
@org.springframework.stereotype.Service
public class Service {
	@Autowired
	IRepo repo;
	 
	public List<Product> getAllProduct() {
 		return repo.findAll();
	}

	public Product insertProduct(Product pro) {
 		return repo.save(pro) ;
	}

	public Product updateProduct(Product pro) {
 		 return repo.save(pro);
	}

	public boolean deleteProduct(int proId) {
		repo.deleteById(proId);
		return true;
	}

}
