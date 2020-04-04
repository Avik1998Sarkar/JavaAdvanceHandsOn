package com.spring.ui;

import java.util.Scanner;



import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.spring.app.Address;

import com.spring.app.AddressBook;



public class Driver {





 public static AddressBook loadAddressBook()

 {

 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

 AddressBook addressBook = (AddressBook) ctx.getBean("addBookObj");

 return addressBook;

 }



 public static void main(String[] args)

 {

 //invoke the loadAddressBook() method from main retrieve the AddressBook object, get the details from the user set the values and display the values

 Scanner sc=new Scanner(System.in);

 System.out.println("Enter the temporary address");

 System.out.println("Enter the house name");

 String name=sc.nextLine();

 System.out.println("Enter the street");

 String street=sc.nextLine();

 System.out.println("Enter the city");

 String city=sc.nextLine();

 System.out.println("Enter the state");

 String state=sc.nextLine();

 System.out.println("Enter the phone number");

 String phone=sc.nextLine();



 Address add=new Address();

 add.setHouseName(name);

 add.setCity(city);

 add.setState(state);

 add.setStreet(street);





 AddressBook ad=loadAddressBook();



 ad.setPhoneNumber(phone);

 ad.setTempAddress(add);



 System.out.println("Temporary address");

 System.out.println("House name:"+ad.getTempAddress().getHouseName());

 System.out.println("Street:"+ad.getTempAddress().getStreet());

 System.out.println("City:"+ad.getTempAddress().getCity());

 System.out.println("State:"+ad.getTempAddress().getState());

 System.out.println("Phone number :"+ad.getPhoneNumber());

 }



}