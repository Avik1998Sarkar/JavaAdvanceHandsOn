package com.app.driver;



import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.spring.app.EmployeeDAO;

import com.spring.app.DBConfig;



public class Main {

   

 @SuppressWarnings("resource")

 public static void main(String[] args) {



  ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

  EmployeeDAO bean = (EmployeeDAO) ctx.getBean("emp");

  DBConfig dbConfig = bean.getDbConfig();

  System.out.println(dbConfig.getDriverName());

  System.out.println(dbConfig.getUrl());

  System.out.println(dbConfig.getUserName());

  System.out.println(dbConfig.getPassword());

 

  

 }

}