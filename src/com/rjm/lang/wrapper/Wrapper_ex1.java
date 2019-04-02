package com.rjm.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {

	public void ex2() {

		// 비밀번호를 입력
		// 대문자 1개 이상, 소문자 1개 이상, 공백은 없어야 하고
		// 숫자 1개 이상으로 조합
		// 최소 6자 이상

		int count = 0; // 문자열의 길이를 담을 변수
		int upper = 0; // 문자열의 대문자를 담을 변수
		int lower = 0; // 문자열의 소문자를 담을 변수
		int digit = 0; // 숫자의 갯수를 담을 변수
		int space = 0; // 공백의 갯수를 담을 변수

		Scanner sc = new Scanner(System.in);

		System.out.println("비밀 번호 입력");

		String pw = sc.nextLine(); // 공백의 포함 여부

		count = pw.length();

		if (count > 5) {
			for (int i = 0; i < count; i++) {
				char ch = pw.charAt(i);
				if (Character.isUpperCase(ch)) {
					upper++;
				} else if (Character.isLowerCase(ch)) {
					lower++;
				} else if (Character.isDigit(ch)) {
					digit++;
				} else if (Character.isWhitespace(ch)) {
					space++;
				} else {

				}

			} // for 끝
			if (upper > 0 && lower > 0 && digit > 0 && space == 0) {
				System.out.println("OK");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("최소 6글자 이상");
		}
	}

	// isUppercase : 대문자면 true 아니면 false
	// isLowercase : 소문자면 ture 아니면 false
	// trim : 문자열의 양쪽 끝에 있는 공백을 제거
	// subString : 문자열의 일부를 반환(잘라오는 것)

	public void ex1() {

		// 주민번호를 입력
		// 1. 나이가 ??
		// 2. 3월~5월 : 봄, 6월~8월 : 여름, 9월 ~11월 : 가을, 12월 ~ 2월 : 겨울

		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호 입력:");
		String num = sc.next();
		String social = "940108-1234567";
		String month = social.substring(2, 4); // 12 문자열
		int m = Integer.parseInt(month); // 자주 사용함
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
