package com.rjm.util.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest5 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance(); // Calendar 객체 생성
		System.out.println("현재시각 :  " + ca.getTime()); // 현재시각을 알려주는 메소드

		ca.set(2019, 1, 1);
		// set메소드를 통해 연도 월 일 을 설정

		// 해당월의 마지막 일
		int max = ca.getActualMaximum(Calendar.DATE); // 날짜가 셋팅 된 Calender 가 가질수 있는 값 = 30
		// 첫 날의 요일
		int week = ca.get(Calendar.DAY_OF_WEEK)-1; // 요일-1
		System.out.println(week);

		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println();

		for (int i = 0; i < week; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= max; i++) {
			System.out.print(i + "\t");
			if ((i+week) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Year : " + Calendar.YEAR);
		System.out.println("Month : " + Calendar.MONTH);
		System.out.println("Date : " + Calendar.DATE);

	}
}
