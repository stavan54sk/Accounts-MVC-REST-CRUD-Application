//package com.stavan.cms.data;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//import com.stavan.cms.domain.Customer;
//
//public enum CustomerMap {
//
//INSTANCE;
//	
//private Map<Integer, Customer> map;
//
//private CustomerMap() {
//map=new HashMap<>();
//
//Customer c1=new Customer("sachin Patil","axpc9856d","8145527652","Pune",new Date(1982,11,11));
//Customer c2=new Customer("Prakash Patil","xxpc9856a","7745527652","Pune",new Date(1990,11,11));
//Customer c3=new Customer("Sumit Chavan","cxpc9856f","7245527652","Pune",new Date(1987,11,11));
//Customer c4=new Customer("Pradeep Chinchole","bxpc9856v","7345527652","Banglore",new Date(1982,11,11));
//Customer c5=new Customer("Rajesh Patil","pxpc9856d","9545527652","Mumbai",new Date(2000,11,11));
//
//map.put(c1.getCustomerId(), c1);
//map.put(c2.getCustomerId(), c2);
//map.put(c3.getCustomerId(), c3);
//map.put(c4.getCustomerId(), c4);
//map.put(c5.getCustomerId(), c5);
//}
//
//
//
//public Map<Integer, Customer> getMap() {
//	return map;
//}
//
//}
