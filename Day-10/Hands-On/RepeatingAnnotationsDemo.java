/**
 * 
 */
package com.onebill.training.day10;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Rathesh Prabakar
 *
 */
public class RepeatingAnnotationsDemo {
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Cars{
		Manufacturer[] value() default{};
	}
	
	@Manufacturer("Hyundai")
	@Manufacturer("Tata")
	@Manufacturer("BMW")
	@Manufacturer("Audi")
	public @interface Car{
		String value();
	}
	
	@Repeatable(value = Cars.class)
	public @interface Manufacturer{
		String value();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manufacturer[] a = Car.class.getAnnotationsByType(Manufacturer.class);
		System.out.println("Car Manufactures.."+a.length);
	      Cars cars = Car.class.getAnnotation(Cars.class);
		
		for (Manufacturer manufacturer : cars.value()) {
			System.out.println(manufacturer.value());
		}
	}

}
