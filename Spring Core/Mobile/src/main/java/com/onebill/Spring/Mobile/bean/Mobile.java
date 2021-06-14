package com.onebill.Spring.Mobile.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private String name;
	@Autowired
	private Charger charger;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	public Mobile() {
		
	}
	synchronized public void use() {
		if(charger.getPercentage()==0)
			System.out.println("Zero Percentage Please Plug in");
		else {
			System.out.println("Using "+ name);			
			try {
				while(charger.getPercentage()>0) {
					wait(10);
					System.out.println("Battery drains 1% for each 1 seconds");
					charger.setPercentage(charger.getPercentage()-1);
					System.out.println(charger.getPercentage()+"%");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
