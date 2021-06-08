/**
 * 
 */
package com.onebill.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rathesh Prabakar
 *
 */
@Entity
@Table(name= "movies")
public class Movie {
	
	@Id
	private int mid;
	private String mname;
	private double mrating;
	private String mreview;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public double getMrating() {
		return mrating;
	}
	public void setMrating(double mrating) {
		this.mrating = mrating;
	}
	public String getMreview() {
		return mreview;
	}
	public void setMreview(String mreview) {
		this.mreview = mreview;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mrating=" + mrating + ", mreview=" + mreview + "]";
	}
	
	
	
	
}
