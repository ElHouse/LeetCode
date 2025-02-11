package com.leetcode;


import java.time.LocalDate;


public class _1185_Day_of_the_Week {

	
//	Runtime: 33 ms, faster than 13.37% of Java online submissions for Day of the Week.
//	Memory Usage: 34.8 MB, less than 100.00% of Java online submissions for Day of the Week.
	public String dayOfTheWeek(int day, int month, int year) {

		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
		
		LocalDate dia = LocalDate.ofEpochDay(LocalDate.of(year, month, day).getDayOfWeek().getValue()-1);
				
		return days[dia.getDayOfWeek().getValue()-1];
	}
	

}
