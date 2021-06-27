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
public class Account {

	private int accno;
	private String name;
	private int balance;
	private String doc;
	private String type;

	public Account(String name, int balance, String doc, String type) {
		super();
		this.accno = new Random().nextInt(100000);
		this.name = name;
		this.balance = balance;
		this.doc = doc;
		this.type = type;
	}

	public Account() {
		this.accno = new Random().nextInt(100000);
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
