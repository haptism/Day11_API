package com.rjm.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex2 {

	public void ex1() {

		// 주민번호 입력 941126-1234567
		// 마지막 번호는 체크용 번호로 따로 저장
		//  9 4 1 2 2 6 - 1 2 3 4 5 6 7
		// *2 3 4 5 6 7   8 9 2 3 4 5
		// 18 + 12 +4 +10 .....
		// 결과를 11로 나눈 나머지를 구하기
		// 나머지를 11로 뺸값을 체크용 번호랑 비교해서 같으면 OK
		// 위의 결과값이 두자리라면
		// 위의 결과값으 10으로 나눈 나머지를 체크번호랑 비교
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		String social = "940108-1234567";
		
		
		
		
		

	}
}
