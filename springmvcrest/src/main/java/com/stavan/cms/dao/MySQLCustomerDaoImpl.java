//package com.stavan.cms.dao;
//
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.stavan.cms.data.CustomerMap;
//import com.stavan.cms.domain.Customer;
//
//@Repository
//public class MySQLCustomerDaoImpl implements CustomerDao {
//	
//	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
//	
//	
//	
//	public MySQLCustomerDaoImpl() {
//	
//	System.out.println("=============MySQLCustomerDaoImpl  created=============");
//	}
//
//	@Override
//	public boolean saveCustomer(Customer customer) {
//
//		
//		return jdbcTemplate.update("INSERT INTO CUSTOMERS VALUES(?,?,?,?,?,?)",
//				customer.getCustomerId(),
//				customer.getName(),
//				customer.getPan(),
//				customer.getMobile(),
//				customer.getAddress(),
//				customer.getDob())==1;
//		
//		
//		
//		
//	}
//
//	@Override
//	public boolean updateCustomer(Customer customer) {
//
//		return jdbcTemplate.update("UPDATE CUSTOMERS SET MOBILE=?,ADDRESS=? WHERE CUSTOMERID=?",
//				customer.getMobile(),
//				customer.getAddress(),
//				customer.getCustomerId())==1;	
//	}
//
//	@Override
//	public boolean deleteCustomer(int customerId) {
//		return jdbcTemplate.update("DELETE FROM CUSTOMERS WHERE CUSTOMERID=?",
//					customerId)==1;	
//
//	}
//
//	@Override
//	public Customer findCustomer(int customerId) {
//
//		return jdbcTemplate.queryForObject("SELECT * FROM CUSTOMERS WHERE CUSTOMERID=? ", new CustomerRowMapper(),customerId);
//	}
//
//	@Override
//	public Collection<Customer> findAllCustomers() {
//
//		return jdbcTemplate.query("SELECT * FROM CUSTOMERS", new CustomerRowMapper());
//
//	}
//
//}
