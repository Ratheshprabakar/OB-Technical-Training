/**
 * 
 */
package com.onebill.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Rathesh Prabakar
 *
 */
@Entity
@Table (name="item")
@Data
public class Item {
	private int id;
	private String itemname;

}
