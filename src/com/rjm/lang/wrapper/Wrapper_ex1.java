package com.rjm.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {

	public void ex1() {
		
		// 주민번호를 입력
		// 1. 나이가 ??
		// 2. 3월~5월 : 봄, 6월~8월 : 여름, 9월 ~11월 : 가을, 12월 ~ 2월 : 겨울

		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호 입력:");	
		String num=sc.next();
		String social = "9401018-1234567";
		String month = social.substring(2, 4); // 12 문자열
		int m = Integer.parseInt(month);
		if (m >= 3 && m <= 5) {
			System.out.println("봄");
		} else if (m >= 6 && m <= 8) {
			System.out.println("여름");
		} else if (m >= 9 && m <= 11) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}
	}
}
