package com.rjm.util.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar in = Calendar.getInstance();
		Calendar out = Calendar.getInstance();

		System.out.println("종료시간을 입력");
		String time = sc.next(); // 3-50

		String[] times = time.split("-");
		out.set(Calendar.HOUR_OF_DAY, Integer.parseInt(times[0]));
		out.set(Calendar.MINUTE, Integer.parseInt(times[0]));

		long inTime = in.getTimeInMillis();
		long outTime = out.getTimeInMillis();
		long result = outTime - inTime;
		long h = result / (1000 * 60 * 60);
		long m = result % (1000 * 60 * 60);
		System.out.println(h);
		if (m > 0) {
			h++;
		}
		if (h < 1) {
			h = 1;
		}

		System.out.println("최종요금 : " + h * 1000);

		// 시간당 1000

	}
}
