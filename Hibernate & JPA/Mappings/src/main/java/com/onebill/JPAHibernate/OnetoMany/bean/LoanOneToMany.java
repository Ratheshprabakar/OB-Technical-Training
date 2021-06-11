/**
 * 
 */
package com.onebill.JPAHibernate.OnetoMany.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * @author Rathesh Prabakar
 *
 */
public class LoanOneToMany {
	@Id
	private int lid;
	private String loanName;
	
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

	public List<CustomerOneToMany> getCustomer() {
		return customer;
	}

	public void setCustomer(List<CustomerOneToMany> customer) {
		this.customer = customer;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy="loanOneToMany")
	private List<CustomerOneToMany> customer;
}
