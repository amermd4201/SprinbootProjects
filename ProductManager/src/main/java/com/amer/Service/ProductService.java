package com.amer.Service;

import java.util.List;

import com.amer.Product.Product;
import com.amer.ProductRepository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository repos;

	public List<Product> listAll() {
		return repos.findAll();
	}

	public void save(Product product) {
		repos.save(product);
	}

	public Product get(long id) {
		return repos.findById(id).get();
	}

	public void delete(long id) {
		repos.deleteById(id);
	}
}
