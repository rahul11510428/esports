package com.niit.configuration;


import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.model.Authorities;
import com.niit.model.BillingAddress;
import com.niit.model.Cart;
import com.niit.model.CartItem;
import com.niit.model.Category;
import com.niit.model.Customer;
import com.niit.model.CustomerOrder;
import com.niit.model.Product;
import com.niit.model.ShippingAddress;
import com.niit.model.User;


@Configuration
@EnableTransactionManagement
public class DBConfiguration {
	 
	 
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/test6");
		datasource.setUsername("rahul428");
		datasource.setPassword("");
		return datasource;
	}
		 
		@Bean
		public SessionFactory sessionFactory()
		{
			LocalSessionFactoryBuilder lsf =new LocalSessionFactoryBuilder(getDataSource());	
			Properties hibernateproperties = new Properties();
			hibernateproperties.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect");
			hibernateproperties.setProperty("hibernate.hbm2ddl.auto","update");
			hibernateproperties.setProperty("hibernate.show_sql","true");
			lsf.addProperties(hibernateproperties);
			Class classes[] = new Class[]{Product.class,Category.class,Customer.class,User.class,BillingAddress.class,ShippingAddress.class,Authorities.class,Cart.class,CartItem.class,CustomerOrder.class};
			return lsf.addAnnotatedClasses(classes).buildSessionFactory();
			
		}
		
		@Bean
		public HibernateTransactionManager hibernatetransmanage()
		{
			return new HibernateTransactionManager(sessionFactory());
		}

	}

 
