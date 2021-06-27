//package com.stavan.cms.rest;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.pradeep.cms.domain.Customer;
//import com.pradeep.cms.service.CustomerService;
//
//@RestController
//@RequestMapping("/customers")
//public class CustomerRestController {
//
//	@Qualifier("mapCustomerServiceImpl")
//	@Autowired
//	private CustomerService customerService;
//
//	public CustomerRestController() {
//		System.out.println("CustomerController created....");
//	}
//
//	@GetMapping
//	public List<Customer> getallCustomers() {
//		return new ArrayList<>(customerService.findAllCustomers());
//	}
//
//	@GetMapping("/{customerId}")
//	public Customer getCustomer(@PathVariable("customerId") int id) {
//		return customerService.findCustomer(id);
//	}
//
//	@DeleteMapping("/{customerId}")
//	public Collection<Customer> deleteCustomer(@PathVariable("customerId") int id) {
//		customerService.deleteCustomer(id);
//
//		return customerService.findAllCustomers();
//	}
//
//	@PutMapping("/{customerId}")
//	public Collection<Customer> updateCustomer(@PathVariable("customerId") int id, @RequestBody Customer customer) {
//		customerService.updateCustomer(customer);
//		return customerService.findAllCustomers();
//	}
//
//	@PostMapping
//	public Collection<Customer> addCustomer(@RequestBody Customer customer) {
//		customerService.saveCustomer(customer);
//		return customerService.findAllCustomers();
//	}
//
//}
