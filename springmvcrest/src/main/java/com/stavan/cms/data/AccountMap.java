package com.stavan.cms.data;

import java.util.HashMap;
import java.util.Map;

import com.stavan.cms.domain.Account;

public enum AccountMap {

INSTANCE;
	
private Map<Integer, Account> map;

private AccountMap() {
map=new HashMap<>();

Account c1=new Account("sachin Patil",7652,"PC","S");
Account c2=new Account("Prakash Patil",3252,"AC","C");
Account c3=new Account("Sumit Chavan",8532,"PC","C");
Account c4=new Account("Pradeep Chinchole",2685,"AC","S");
Account c5=new Account("Rajesh Patil",9852,"PC","S");

map.put(c1.getAccno(), c1);
map.put(c2.getAccno(), c2);
map.put(c3.getAccno(), c3);
map.put(c4.getAccno(), c4);
map.put(c5.getAccno(), c5);
}



public Map<Integer, Account> getMap() {
	return map;
}

}
