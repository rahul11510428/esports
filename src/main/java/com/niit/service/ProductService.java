package com.niit.service;

import java.util.List;

import com.niit.model.Category;
import com.niit.model.Product;

public interface ProductService
{

	void saveProduct(Product product);

	public List<Product> getAllProducts();
	public Product getProductById(int id);
	public void deleteProduct(int id);
	public void updateProduct(Product product);
	public List<Category> getAllCategories();
}
