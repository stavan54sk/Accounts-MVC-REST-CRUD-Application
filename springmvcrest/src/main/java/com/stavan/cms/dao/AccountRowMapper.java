package com.stavan.cms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.stavan.cms.domain.Account;

public class AccountRowMapper implements RowMapper<Account>{

	@Override
	public Account mapRow(ResultSet rs, int rownum) throws SQLException {
	
		Account c=new Account();
		
	
		c.setAccno(rs.getInt(1));
		c.setName(rs.getString(2));
		c.setBalance(rs.getInt(3));
		c.setDoc(rs.getString(4));
		c.setType(rs.getString(5));
		
		System.out.println("In maprow method.....");
		return c;
	}

}
