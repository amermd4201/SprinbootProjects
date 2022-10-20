package com.eurekaserverproject.service;

import java.util.List;

import com.eurekaserverproject.entity.Product;

public interface ProductService {
   
	public String addProducts(Product prd);
	public List<Product>getProducts();
	 
}
