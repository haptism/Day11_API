package com.rjm.util.calendar;

import java.time.DayOfWeek;
import java.util.Calendar;

public class CalendarTest2 {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		// 1994.01.08 토요일
		// 생일을 세팅
		// 요일은 무슨요일?

		cal.set(1994, 1, 8);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

//		int d = cal.get(Calendar.DATE) + 3;
//		cal.set(Calendar.DATE, d);

		System.out.println("Month : " + cal.get(Calendar.MONTH));
//		cal.roll(Calendar.DATE, 28);
		cal.add(Calendar.DATE, 28);
		System.out.println("Month : " + cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));

	}

}
