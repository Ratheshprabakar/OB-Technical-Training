package com.onebill.JPAHibernate.OnetoOne.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class LoanOneToOne {

	@Id
	private int lid;
	private String loanName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerOneToOne customer;
	
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public CustomerOneToOne getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerOneToOne customer) {
		this.customer = customer;
	}

}
