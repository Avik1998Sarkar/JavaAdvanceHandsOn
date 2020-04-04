package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext apx = new ClassPathXmlApplicationContext("beans.xml");
		CurrencyConverter bean = (CurrencyConverter) apx.getBean("converter");
//		System.out.println(bean);
		System.out.println(bean.getTotalCurrencyValue("5euro"));
	}
}
