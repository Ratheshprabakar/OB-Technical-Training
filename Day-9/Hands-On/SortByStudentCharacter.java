package com.onebill.training.day9;

import java.util.Comparator;

public class SortByStudentCharacter implements Comparator<TreeSetStudent> {

	@Override
	public int compare(TreeSetStudent o1, TreeSetStudent o2) {
		return o1.studentChar.compareTo(o2.studentChar);
	}

}
