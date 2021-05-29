/**
 * 
 */
package com.onebill.training.day9.assignments.javacollections;

/**
 * @author Rathesh Prabakar
 *
 */
public class Customers implements Comparable<Customers> {
	
	int custid;
	String customerName;
	
	public Customers(int custid, String customerName) {
		super();
		this.custid = custid;
		this.customerName= customerName;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customers [custid=" + custid + ", customerName=" + customerName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + custid;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		if (custid != other.custid)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	@Override
	public int compareTo(Customers o) {
		// TODO Auto-generated method stub
		return this.customerName.compareTo(o.customerName);
	}
	
}
