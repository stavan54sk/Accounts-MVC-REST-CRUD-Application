package com.stavan.cms.mvc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stavan.cms.domain.Account;
import com.stavan.cms.service.AccountService;

@Controller
//@Component("AccountMainApp")
public class AccountMvcController {

	@Qualifier("mapAccountServiceImpl")
	@Autowired
	private AccountService AccountService;

	public AccountMvcController() {
		System.out.println("=============AccountSpringController  created=============");
	}
	
	@GetMapping("/new")
	public String newAccount(ModelMap map) {

		map.addAttribute("account", new Account());

		map.addAttribute("accounts", AccountService.findAllAccounts());

		return "addAccount";
	}

	@PostMapping("/add")
	public String addAccount(@ModelAttribute("Account") Account Account, ModelMap map) {

		AccountService.saveAccount(Account);

		map.addAttribute("accounts", AccountService.findAllAccounts());
		return "accountList";
	}

	@RequestMapping("/edit/{accno}")
	public String newAccount(@PathVariable("accno")int accno,ModelMap map) {

		map.addAttribute("account", AccountService.findAccount(accno));

		map.addAttribute("accounts", AccountService.findAllAccounts());

		return "editAccount";
	}
	
	@PostMapping("/update")
	public String updateAccount(@ModelAttribute("Account")Account Account, ModelMap map) {

		AccountService.updateAccount(Account);

		map.addAttribute("accounts", AccountService.findAllAccounts());
		return "accountList";
	}
	
	@GetMapping("/delete")
	public String deleteAccount( @RequestParam("accno") int accno,ModelMap map) {
		
		AccountService.deleteAccount(accno);
		
		map.addAttribute("accounts", AccountService.findAllAccounts());

		return "accountList";
	}

	public void showAccount(int AccountId) {

		Account Account = AccountService.findAccount(AccountId);

		if (Account != null)
			System.out.println("Account with id [" + AccountId + "] Details \n\n" + Account);
		else
			System.out.println("Account not found");
	}

	@GetMapping
	public String getAllAccounts(ModelMap map) {

		map.addAttribute("accounts", AccountService.findAllAccounts());

		return "accountList";
	}

	@PostConstruct
	public void init() {
		System.out.println("================AccountMainApp  initialized============");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("================AccountMainApp  destroyed============");
	}

}
