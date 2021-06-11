package com.onebill.JPAHibernate.ManyToMany.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerManyToMany {

	@Id
	private int cid;
	private String customerName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "loan_mappings", joinColumns = @JoinColumn(name="cid"),inverseJoinColumns = @JoinColumn(name ="lid"))
	private List<LoanManyToMany> manyLoan;

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

	public List<LoanManyToMany> getManyLoan() {
		return manyLoan;
	}

	public void setManyLoan(List<LoanManyToMany> manyLoan) {
		this.manyLoan = manyLoan;
	}
}
