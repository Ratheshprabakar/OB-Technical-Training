/**
 * 
 */
package com.onebill.training.day9.assignments.javacollections;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * @author Rathesh Prabakar
 *
 */
public class VectorPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Person> p = new Vector<Person>();
		
		p.add(new Person(1, "Alan"));
		p.add(new Person(3, "Diya"));
		p.add(new Person(2, "Karthi"));
		p.add(new Person(9, "Naveen"));
		p.add(new Person(15, "Jeeva"));
		
		for (Person person : p) {
			System.out.print(person.getPersonId()+" ");
			System.out.println(person.getPname());
		}
		
		Collections.sort(p);
		System.out.println("After Sorting(Using Comporable)");
		for (Person person : p) {
			System.out.print(person.getPersonId()+" ");
			System.out.println(person.getPname());
		}
		
		
	
	}

}
