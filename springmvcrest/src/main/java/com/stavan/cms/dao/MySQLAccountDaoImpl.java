package com.stavan.cms.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.stavan.cms.data.AccountMap;
import com.stavan.cms.domain.Account;

@Repository
public class MySQLAccountDaoImpl implements AccountDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	
	public MySQLAccountDaoImpl() {
	
	System.out.println("=============MySQLAccountDaoImpl  created=============");
	}

	@Override
	public boolean saveAccount(Account account) {

		
		return jdbcTemplate.update("INSERT INTO ACCOUNTS VALUES(?,?,?,?,?,?)",
				account.getAccno(),
				account.getName(),
				account.getBalance(),
				account.getDoc(),
				account.getType())==1;
		
		
		
		
	}

	@Override
	public boolean updateAccount(Account account) {

		return jdbcTemplate.update("UPDATE ACCOUNTS SET NAME=?,BALANCE=?,DOC=?,TYPE=? WHERE ACCNO=?",
				account.getName(),
				account.getBalance(),
				account.getDoc(),
				account.getType(),
				account.getAccno())==1;
	}

	@Override
	public boolean deleteAccount(int accountId) {
		return jdbcTemplate.update("DELETE FROM ACCOUNTS WHERE ACCNO=?",
					accountId)==1;	

	}

	@Override
	public Account findAccount(int accountId) {

		return jdbcTemplate.queryForObject("SELECT * FROM ACCOUNTS WHERE ACCNO=? ", new AccountRowMapper(),accountId);
	}

	@Override
	public Collection<Account> findAllAccounts() {

		return jdbcTemplate.query("SELECT * FROM ACCOUNTS", new AccountRowMapper());

	}

}
