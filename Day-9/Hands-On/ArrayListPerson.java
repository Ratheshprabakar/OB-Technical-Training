/**
 * 
 */
package com.onebill.training.day9;

/**
 * @author Rathesh Prabakar
 *
 */
public class ArrayListPerson implements Comparable<ArrayListPerson> {
	int id;
	String personName;
	public ArrayListPerson(int id, String personName) {
		super();
		this.id = id;
		this.personName = personName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "ArrayListPerson [id=" + id + ", personName=" + personName + "]";
	}
	@Override
	public int compareTo(ArrayListPerson o) {
		// TODO Auto-generated method stub
		return o.id - this.id;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	

}
