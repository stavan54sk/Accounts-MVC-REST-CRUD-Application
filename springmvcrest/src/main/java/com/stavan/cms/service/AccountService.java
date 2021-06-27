package com.stavan.cms.service;

import java.util.Collection;

import com.stavan.cms.domain.Account;

public interface AccountService {
	boolean saveAccount(Account account);

	boolean updateAccount(Account account);

	boolean deleteAccount(int accountId);

	Account findAccount(int accountId);

	Collection<Account> findAllAccounts();
}
