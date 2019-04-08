package com.rjm.util.calendar;

import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest7 {

	public static void main(String[] args) throws ParseException {

		// java.text.SimpleDateFormat
		// 문자열 -> Calendar

		String now = "2019-06-05";

		SimpleDateFormat st = new SimpleDateFormat("yyyy-MM-dd");

		Date d = st.parse(now);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);

		System.out.println(calendar.get(Calendar.MONTH));

	}
}