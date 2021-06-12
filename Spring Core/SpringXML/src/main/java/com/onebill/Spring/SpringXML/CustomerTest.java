package com.onebill.Spring.SpringXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.Spring.bean.CustomerBean;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("customerConfig.xml");
		 CustomerBean c = (CustomerBean) context.getBean("customer");
		 
		 System.out.println(c.getFirstName());
		

	}

}
