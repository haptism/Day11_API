package com.rjm.util.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {

		// 추상클래스 new 생성 XXXX
		// 현재 시간을 담음

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		// 특정한 날짜 데이터를 꺼낼때, get
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
		int mon = cal.get(Calendar.MONTH);
		System.out.println(mon + 1);
		
		// 2100
		cal.set(Calendar.YEAR, 2100);
		System.out.println(cal.get(Calendar.YEAR));

		// 1월로
		cal.set(Calendar.MONTH, 0);
		System.out.println(cal.get(Calendar.MONTH + 1));

		cal.set(Calendar.HOUR_OF_DAY, 22);
 
		System.out.println(Calendar.HOUR);
		System.out.println(Calendar.HOUR_OF_DAY);

		cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		
		
	}

}
