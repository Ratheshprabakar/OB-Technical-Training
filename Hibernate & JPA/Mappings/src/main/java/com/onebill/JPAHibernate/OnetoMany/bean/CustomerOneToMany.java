package com.onebill.JPAHibernate.OnetoMany.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "customer")
public class CustomerOneToMany {

	@Id
	private int cid;
	private String customerName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="lid")
	private LoanOneToMany loanOneToMany;

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

	public LoanOneToMany getLoanOneToMany() {
		return loanOneToMany;
	}

	public void setLoanOneToMany(LoanOneToMany loanOneToMany) {
		this.loanOneToMany = loanOneToMany;
	}

}
