package com.niit.esports;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.dao.ProductDaoImpl;
import com.niit.model.Product;
import com.niit.service.ProductService;
import com.niit.service.ProductServiceImpl;

 
public class App 
{
    public static void main(String[] args) throws Exception
    {    	
     System.out.println("Hello World!");  	
    	
   	 ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductServiceImpl.class,ProductDaoImpl.class);
   	 
   	 ProductService productService = (ProductService)context.getBean("productServiceImpl");
           
        Product product = new Product();
        product.setId(1);
        product.setProductname("Pencil");
        product.setPrice(200);
        product.setQuantity(10);
        product.setDescription("this is the decription about Pencil");
        
        productService.saveProduct(product);
    }
}
