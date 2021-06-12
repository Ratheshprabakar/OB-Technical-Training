package com.onebill.Spring.SpringXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.Spring.bean.MessageBean;

public class MessageDemo {
 public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("messageConfig.xml");
	MessageBean messageBean = (MessageBean) context.getBean("message");
	
	System.out.println(messageBean.getMessage());
	
}
}
