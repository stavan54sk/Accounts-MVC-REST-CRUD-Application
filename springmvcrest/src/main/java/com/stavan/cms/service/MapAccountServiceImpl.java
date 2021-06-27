package com.stavan.cms.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.stavan.cms.dao.AccountDao;
import com.stavan.cms.domain.Account;

@Service
public class MapAccountServiceImpl implements AccountService{

	@Qualifier("mapAccountDaoImpl")
	@Autowired
	private AccountDao accountDao; 
	
	
	
	public MapAccountServiceImpl() {
	
		System.out.println("=============MapAccountServiceImpl  created=============");

	}
	
	public AccountDao getAccountDao() {
		return accountDao;
	}
	
	
	
	
	@Override
	public boolean saveAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.saveAccount(account);
	}

	@Override
	public boolean updateAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.updateAccount(account);
	}

	@Override
	public boolean deleteAccount(int accno) {
		// TODO Auto-generated method stub
		return accountDao.deleteAccount(accno);
	}

	@Override
	public Account findAccount(int accno) {
		// TODO Auto-generated method stub
		return accountDao.findAccount(accno);
	}

	@Override
	public Collection<Account> findAllAccounts() {
		// TODO Auto-generated method stub
		return accountDao.findAllAccounts();
	}

}
