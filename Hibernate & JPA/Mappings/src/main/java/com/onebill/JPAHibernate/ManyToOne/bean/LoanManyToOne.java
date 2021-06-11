package com.onebill.JPAHibernate.ManyToOne.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class LoanManyToOne {
	
	@Id
	private int lid;
	private String loanName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="cid")
	private CustomerManyToOne customerManyToMany;

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

	public CustomerManyToOne getCustomerManyToMany() {
		return customerManyToMany;
	}

	public void setCustomerManyToMany(CustomerManyToOne customerManyToMany) {
		this.customerManyToMany = customerManyToMany;
	}
	

}
