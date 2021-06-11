package com.onebill.JPAHibernate.ManyToMany.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class LoanManyToMany {
	
	@Id
	private int lid;
	private String loanName;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy = "manyLoan")
	private List<CustomerManyToMany> customers;

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

	public List<CustomerManyToMany> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerManyToMany> customers) {
		this.customers = customers;
	}
	

}
