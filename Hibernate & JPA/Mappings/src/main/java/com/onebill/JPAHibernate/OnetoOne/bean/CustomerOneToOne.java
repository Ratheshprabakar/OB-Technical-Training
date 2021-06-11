/**
 * 
 */
package com.onebill.JPAHibernate.OnetoOne.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Rathesh Prabakar
 *
 */
@Entity
@Table(name = "customer")
public class CustomerOneToOne {
	@Id
	private int cid;
	private String customerName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="lid")
	private LoanOneToOne loan;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LoanOneToOne getLoan() {
		return loan;
	}

	@Override
	public String toString() {
		return "CustomerOneToOne [cid=" + cid + ", customerName=" + customerName + ", loan=" + loan + "]";
	}

	public void setLoan(LoanOneToOne loan) {
		this.loan = loan;
	}

}
