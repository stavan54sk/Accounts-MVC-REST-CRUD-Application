package com.stavan.cms.domain;

import java.util.Date;
import java.util.Random;
/*
 * 
 * create database company;
 * 
 * use company;
 * 
 * create table customers(
 * customerId int primary key,
 * name text,
 * pan text,
 * mobile text,
 * address text,
 * dob date
 * );
 * 
 * */
public class Customer {

	private int customerId;
	private String name;
	private String pan;
	private String mobile;
	private String address;
	private Date dob;

	public Customer() {
		this.customerId = new Random().nextInt(100000);
	}

	public Customer(String name, String pan, String mobile, String address, Date dob) {
		this.customerId = new Random().nextInt(100000);
		this.name = name;
		this.pan = pan;
		this.mobile = mobile;
		this.address = address;
		this.dob = dob;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", pan=" + pan + ", mobile=" + mobile
				+ ", address=" + address + ", dob=" + dob + "]";
	}

}
