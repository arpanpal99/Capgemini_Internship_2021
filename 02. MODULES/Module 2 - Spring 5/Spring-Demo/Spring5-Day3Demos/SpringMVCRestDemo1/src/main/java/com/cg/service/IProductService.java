package com.cg.service;

import java.util.List;

import com.cg.model.Product;

public interface IProductService {

	public List<Product> getAllProducts();

	public Product findProduct(Integer productId);

	public List<Product> deleteProduct(Integer productId);

	public List<Product> saveProduct(Product product);

	public List<Product> updateProduct(Product product);
	public List<Product> saveAll();
}
