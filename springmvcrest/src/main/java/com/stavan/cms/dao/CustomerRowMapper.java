//package com.stavan.cms.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.springframework.jdbc.core.RowMapper;
//
//import com.stavan.cms.domain.Customer;
//
//public class CustomerRowMapper implements RowMapper<Customer>{
//
//	@Override
//	public Customer mapRow(ResultSet rs, int rownum) throws SQLException {
//	
//		Customer c=new Customer();
//		
//	
//		c.setCustomerId(rs.getInt(1));
//		c.setName(rs.getString(2));
//		c.setPan(rs.getString(3));
//		c.setMobile(rs.getString(4));
//		c.setAddress(rs.getString(5));
//		c.setDob(rs.getDate(6));
//		
//		System.out.println("In maprow method.....");
//		return c;
//	}
//
//}
