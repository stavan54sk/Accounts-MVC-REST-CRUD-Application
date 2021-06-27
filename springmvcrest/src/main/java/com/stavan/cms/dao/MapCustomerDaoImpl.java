//package com.stavan.cms.dao;
//
//import java.util.Collection;
//
//import org.springframework.stereotype.Repository;
//
//import com.stavan.cms.data.CustomerMap;
//import com.stavan.cms.domain.Customer;
//
//
//@Repository
//public class MapCustomerDaoImpl implements CustomerDao {
//	
//	
//	
//	public MapCustomerDaoImpl() {
//	
//	System.out.println("=============MapCustomerDaoImpl  created=============");
//	}
//
//	@Override
//	public boolean saveCustomer(Customer customer) {
//
//		return CustomerMap.INSTANCE.getMap().put(customer.getCustomerId(), customer) == customer;
//	}
//
//	@Override
//	public boolean updateCustomer(Customer customer) {
//
//		if (CustomerMap.INSTANCE.getMap().containsKey(customer.getCustomerId())) {
//			return CustomerMap.INSTANCE.getMap().put(customer.getCustomerId(), customer) == customer;
//		}
//
//		return false;
//	}
//
//	@Override
//	public boolean deleteCustomer(int customerId) {
//		if (CustomerMap.INSTANCE.getMap().containsKey(customerId)) {
//			CustomerMap.INSTANCE.getMap().remove(customerId);
//			return true;
//		}
//		return false;
//	}
//
//	@Override
//	public Customer findCustomer(int customerId) {
//
//		return CustomerMap.INSTANCE.getMap().get(customerId);
//	}
//
//	@Override
//	public Collection<Customer> findAllCustomers() {
//
//		return CustomerMap.INSTANCE.getMap().values();
//	}
//
//}
