package com.me.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.me.business.Bank;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml"); 
		Bank bProxy = (Bank)ap.getBean("pfb");
		int TotalAmount = bProxy.deposite("BOA123", 5000);
		System.out.println(TotalAmount);
	}

}
