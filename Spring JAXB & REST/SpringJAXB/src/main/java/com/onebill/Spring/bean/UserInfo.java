package com.onebill.Spring.bean;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "employee-info")
@XmlAccessorType(XmlAccessType.FIELD)

public class UserInfo {
	
	@XmlElement(name = "user-id")
	private int userId;
	@XmlElement
	private String name;
	@XmlElement(name = "phone")
	private long mobileNumber;
	@XmlElement(name = "email-id")
	private String emailId;
	@XmlTransient //To hide this field in XML
	private int salary;
	@XmlElement
	private int mid;


}
