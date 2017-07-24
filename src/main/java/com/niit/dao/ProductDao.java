package com.niit.dao;

import java.util.List;

import com.niit.model.Category;
import com.niit.model.Customer;
import com.niit.model.Product;
import com.niit.model.User;

public interface ProductDao {

	void saveProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(int id);
	public void deleteProduct(Product product);
	public void updateProduct(Product product);
	public List<Category> getAllCategories();
	public List<Product> getProductByCategory(int cid);
	
}
