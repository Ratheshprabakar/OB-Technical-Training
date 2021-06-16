/**
 * 
 */
package com.onebill.Spring.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author rathesh
 *
 */
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfo implements Serializable {
	
	@Id
	private int empid;
	
	@Column
	private String name;
	
	@Column
	private String pwd;
	
	@Column
	private Date dob;

}
