package com.stavan.cms.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.stavan.cms.data.AccountMap;
import com.stavan.cms.domain.Account;


@Repository
public class MapAccountDaoImpl implements AccountDao {
	
	
	
	public MapAccountDaoImpl() {
	
	System.out.println("=============MapAccountDaoImpl  created=============");
	}

	@Override
	public boolean saveAccount(Account customer) {

		return AccountMap.INSTANCE.getMap().put(customer.getAccno(), customer) == customer;
	}

	@Override
	public boolean updateAccount(Account customer) {

		if (AccountMap.INSTANCE.getMap().containsKey(customer.getAccno())) {
			return AccountMap.INSTANCE.getMap().put(customer.getAccno(), customer) == customer;
		}

		return false;
	}

	@Override
	public boolean deleteAccount(int accno) {
		if (AccountMap.INSTANCE.getMap().containsKey(accno)) {
			AccountMap.INSTANCE.getMap().remove(accno);
			return true;
		}
		return false;
	}

	@Override
	public Account findAccount(int accno) {

		return AccountMap.INSTANCE.getMap().get(accno);
	}

	@Override
	public Collection<Account> findAllAccounts() {

		return AccountMap.INSTANCE.getMap().values();
	}

}
