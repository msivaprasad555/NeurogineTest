package com.neurogine.demo.service;

import java.util.List;

import com.neurogine.demo.entity.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	
	Product getProductById(Long id);
	
	Product saveProduct(Product product);
	
    void deleteProduct(Long id);

}
