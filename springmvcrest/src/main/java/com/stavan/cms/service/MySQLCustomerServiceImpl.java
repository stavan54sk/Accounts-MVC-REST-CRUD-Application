//package com.stavan.cms.service;
//
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import com.mysql.jdbc.Driver;
//import com.stavan.cms.dao.CustomerDao;
//import com.stavan.cms.domain.Customer;
//
//@Service
//public class MySQLCustomerServiceImpl implements CustomerService{
//
//	@Qualifier("mySQLCustomerDaoImpl")
//	@Autowired
//	private CustomerDao customerDao; 
//	
//	
//	
//	public MySQLCustomerServiceImpl() {
//	
//		System.out.println("=============MapCustomerServiceImpl  created=============");
//
//	}
//	
//	public CustomerDao getCustomerDao() {
//		return customerDao;
//	}
//	
//	
//	
//	
//	@Override
//	public boolean saveCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//		return customerDao.saveCustomer(customer);
//	}
//
//	@Override
//	public boolean updateCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//		return customerDao.updateCustomer(customer);
//	}
//
//	@Override
//	public boolean deleteCustomer(int customerId) {
//		// TODO Auto-generated method stub
//		return customerDao.deleteCustomer(customerId);
//	}
//
//	@Override
//	public Customer findCustomer(int customerId) {
//		// TODO Auto-generated method stub
//		return customerDao.findCustomer(customerId);
//	}
//
//	@Override
//	public Collection<Customer> findAllCustomers() {
//		// TODO Auto-generated method stub
//		return customerDao.findAllCustomers();
//	}
//
//}
