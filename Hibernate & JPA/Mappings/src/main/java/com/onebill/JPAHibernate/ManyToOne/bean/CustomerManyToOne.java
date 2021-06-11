/**
 * 
 */
package com.onebill.JPAHibernate.ManyToOne.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Rathesh Prabakar
 *
 */
@Entity
@Table(name ="customer")
public class CustomerManyToOne {
	
	@Id
	private int cid;
	private String customerName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="customerManyToMany")
	private List<LoanManyToOne> loanManyToOne;

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

	public List<LoanManyToOne> getLoanManyToOne() {
		return loanManyToOne;
	}

	public void setLoanManyToOne(List<LoanManyToOne> loanManyToOne) {
		this.loanManyToOne = loanManyToOne;
	}


	
}
