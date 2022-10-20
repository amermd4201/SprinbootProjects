package com.eurekaserverproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eurekaserverproject.entity.Product;
import com.eurekaserverproject.service.ProductServiceImpl;

@RestController
public class ProductController {
	@Autowired
	public ProductServiceImpl productServiceImpl;

	@PostMapping("/addproducts")
	public String saveProducts(@RequestBody Product prd) {
		return productServiceImpl.addProducts(prd);
	}
	@GetMapping("/getProducts")
	public List<Product>getProductsData(){
		return productServiceImpl.getProducts();
	}

}
