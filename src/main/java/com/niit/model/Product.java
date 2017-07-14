package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

 
 

@Entity
public class Product{

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int id;
	 @NotEmpty(message="Product Name Cannot be Empty")
	 private String productname;
	 @Min(value=50)
	 private double price;
	 @Min(value=1)
	 private int quantity;
	 @NotEmpty(message="Description cannot be Empty")
	 private String description;
	 
    @ManyToOne
    @JoinColumn(name="cid")
	private Category category;
	 
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	 
	 
}
