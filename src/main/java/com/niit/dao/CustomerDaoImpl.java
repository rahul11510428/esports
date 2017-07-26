package com.niit.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Authorities;
import com.niit.model.Customer;
import com.niit.model.User;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	public void CustomerDaoImpl()
	{
		System.out.println(" Obj is created");
	}
		
	@Autowired
	private SessionFactory sessionFactory;
	
	public void registerCustomer(Customer customer) {
		
		User user =customer.getUser();
		user.setEnabled(true);
		
		String username =  customer.getUser().getUsername();
		
		Authorities authorities = new Authorities();
		authorities.setRole("ROLE_USER");	
		authorities.setUsername(username);
		Session session = sessionFactory.getCurrentSession();
		session.save(authorities);
		session.save(customer);
	}

	public User validateUser(String username)
	{
	  Session session = sessionFactory.getCurrentSession();
	  Query query =session.createQuery("from User where username=? ");
	  query.setString(0,username);
	  User user =(User)query.uniqueResult();
	  return user;
	  
	}

	public Customer validateCustomer(String email)
	{
	 Session session =sessionFactory.getCurrentSession();
	 Query query =session.createQuery("from Customer where email=?");
	 query.setString(0, email);
	 Customer customer = (Customer)query.uniqueResult();
	 return customer;	 
	}
  
   
}
