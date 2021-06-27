package com.stavan.cms.rest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stavan.cms.domain.Account;
import com.stavan.cms.service.AccountService;

@RestController
public class AccountRestController {

	@Qualifier("mapAccountServiceImpl")
	@Autowired
	private AccountService accountService;

	public AccountRestController() {
		System.out.println("AccountController created....");
	}

	@GetMapping
	public List<Account> getallAccounts() {
		return new ArrayList<>(accountService.findAllAccounts());
	}

	@GetMapping("/{accno}")
	public Account getAccount(@PathVariable("accno") int id) {
		return accountService.findAccount(id);
	}

	@DeleteMapping("/{accno}")
	public Collection<Account> deleteAccount(@PathVariable("accno") int id) {
		accountService.deleteAccount(id);

		return accountService.findAllAccounts();
	}

	@PutMapping("/{accno}")
	public Collection<Account> updateAccount(@PathVariable("accno") int id, @RequestBody Account account) {
		accountService.updateAccount(account);
		return accountService.findAllAccounts();
	}

	@PostMapping
	public Collection<Account> addAccount(@RequestBody Account account) {
		accountService.saveAccount(account);
		return accountService.findAllAccounts();
	}

}
