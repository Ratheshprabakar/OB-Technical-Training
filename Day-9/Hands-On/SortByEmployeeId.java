package com.onebill.training.day9;

import java.util.Comparator;

public class SortByEmployeeId implements Comparator<TreeMapEmployee> {

	@Override
	public int compare(TreeMapEmployee o1, TreeMapEmployee o2) {
		// TODO Auto-generated method stub
		return o1.employeeId-o2.employeeId;
	}


	

}
