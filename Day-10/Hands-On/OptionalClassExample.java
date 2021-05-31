package com.onebill.training.day10;

import java.util.Optional;

public class OptionalClassExample {
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		Integer firstValue = a.orElse(new Integer(0));
		Integer secondValue = b.get();
		return firstValue + secondValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptionalClassExample opexample = new OptionalClassExample();
		Integer value1 = null;
		Integer value2 = new Integer(30);
		
		Optional<Integer> val1 = Optional.ofNullable(value1);
		Optional<Integer> val2 = Optional.of(value2);
		
		System.out.println(opexample.sum(val1,val2));

	}

}
