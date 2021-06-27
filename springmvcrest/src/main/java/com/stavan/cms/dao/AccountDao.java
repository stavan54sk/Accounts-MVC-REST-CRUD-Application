package com.stavan.cms.dao;

import java.util.Collection;

import com.stavan.cms.domain.Account;

public interface AccountDao {

	boolean saveAccount(Account customer);

	boolean updateAccount(Account customer);

	boolean deleteAccount(int customerId);

	Account findAccount(int customerId);

	Collection<Account> findAllAccounts();

}
