package com.onebill.Spring.SpringXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	@Autowired
	private Tyre tyre;

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving Car");
		
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

}
