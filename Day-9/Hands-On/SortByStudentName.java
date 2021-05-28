/**
 * 
 */
package com.onebill.training.day9;

import java.util.Comparator;

/**
 * @author Rathesh Prabakar
 *
 */
public class SortByStudentName implements Comparator<TreeSetStudent> {

	@Override
	public int compare(TreeSetStudent o1, TreeSetStudent o2) {
		return o1.studentName.compareTo(o2.studentName);
	}

}
