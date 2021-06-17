package com.onebill.Spring.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product_info")
public class ProductInfo {

	@Id
	private int pid;

	@Column
	private String name;

	@Column
	private String catagory;

	@Column
	private Double price;

}
