package com.rjm.lang.wrapper;

import java.util.Scanner;

import org.omg.CORBA.portable.ValueBase;

public class Wrapper_ex2 {

	public void ex1() {

		// 주민번호 입력 941126-1234567
		// 마지막 번호는 체크용 번호로 따로 저장
		// 9 4 1 2 2 6 - 1 2 3 4 5 6 7
		// *2 3 4 5 6 7 8 9 2 3 4 5
		// 18 + 12 + 4 + 10 .....
		// 결과를 11로 나눈 나머지를 구하기
		// 나머지를 11로 뺸값을 체크용 번호랑 비교해서 같으면 OK
		// 위의 결과값이 두자리라면
		// 위의 결과값의 10으로 나눈 나머지를 체크번호랑 비교

		String social = "941226-1234567";
		char ch = social.charAt(social.length() - 1); // 한개 줄어들어야됨
		// 체크용 번호
		int check = Integer.parseInt(String.valueOf(ch));
		// 합계를 담을 변수
		int sum = 0;
		// 곱하기 하는 변수
		int count = 2;

		for (int i = 0; i < social.length() - 1; i++) {
			char c = social.charAt(i);

			if (!Character.isDigit(c)) {
				continue;
			}

			String n = String.valueOf(c);
			int num = Integer.parseInt(n);
			sum = sum + num * count;
			count++;
			if (count > 9) {
				count = 2;
			}
		}
		sum = sum % 11;
		sum = 11 - sum;

		if (sum > 9) {
			sum = sum % 10;

		}
		if (sum == check) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}

//		String name = ch + ""; // 함정
//		name = String.valueOf(ch);
//		name = Character.toString(ch);

//		char [] ar = sosical.toCharArray();

//		System.out.println("num : " + 1);
//		System.out.println(1 + "1");
//		System.out.println(1 + '1' + "1"); // primitive 형식은 형변환 함 - 결론 : 문자열
//		System.out.println('1' + "1");

		// Integer
		// charAt : 인덱스 번호를 인자값으로 주면 해당 인덱스 번호의 글자를 반환
		// equals : 두 문자열의 값이 같으면 true, 아니면 false
		// split : 어떤 기준을 가지고 문자열을 파싱(문자열을 자르는 작업)해서 String [ ] 변환

		social = social.replace("-", "");
		System.out.println(social);

		int index = social.indexOf('-');
		String n1 = social.substring(0, index);
		String n2 = social.substring(index + 1);

		String[] ar = social.split("-");

	}
}
