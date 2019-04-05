package com.rjm.util.calendar;

import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		
		// 살아온 날 세기
		
		Calendar ca = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();

//		ca2.set(Calendar.MINUTE, 40);

		ca2.add(Calendar.DATE, 2);
		
		long l = ca.getTimeInMillis(); // 현재시간을
		long l2 = ca2.getTimeInMillis();
		long l3 = l2 - l;

		System.out.println(l3 / (1000 * 60 * 60 * 24));

	}

}
