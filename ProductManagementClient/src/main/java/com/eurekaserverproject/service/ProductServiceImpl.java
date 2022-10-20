package com.eurekaserverproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eurekaserverproject.entity.Product;
import com.eurekaserverproject.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	public ProductRepo productRepo;

	@Override
	public String addProducts(Product prd) {
		Product prduct = productRepo.save(prd);
		if (prduct != null) {
			return "Product Added Successfully";
		} else {
			return "Sorry Buddy Product Not Added";
		}
		// return
	}

	@Override
	public List<Product> getProducts() {
		return productRepo.findAll();
	}

}
