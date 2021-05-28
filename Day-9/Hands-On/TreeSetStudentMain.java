/**
 * 
 */
package com.onebill.training.day9;

import java.util.TreeSet;

/**
 * @author Rathesh Prabakar
 *
 */
public class TreeSetStudentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<TreeSetStudent> ts = new TreeSet<TreeSetStudent>(new SortByStudentName());
		ts.add(new TreeSetStudent(101, "Rathesh", "Good"));
		ts.add(new TreeSetStudent(102, "Abdul", "Angry"));
		ts.add(new TreeSetStudent(103, "Santhosh", "Talkative"));
		
		for (TreeSetStudent treeSetStudent : ts) {
			System.out.println(treeSetStudent.getStudentName());
		}

	}

}
