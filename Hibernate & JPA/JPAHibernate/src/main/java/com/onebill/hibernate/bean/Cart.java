/**
 * 
 */
package com.onebill.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Rathesh Prabakar
 *
 */
@Data
@Entity
@Table (name = "cart")
public class Cart {
	@Id
	private int cid;
	private String cname;
}
