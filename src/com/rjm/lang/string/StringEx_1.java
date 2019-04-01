package com.rjm.lang.string;

import java.util.Scanner;

public class StringEx_1 {

	public void ex5() {
		// jpg, png, gif
		// 업로드할 파일명을 입력
		// 이 파일이 이미지인지 아닌지 판단
		// 이미지가 아니라면 이미지만 업로드 가능..
		// abc.gif(됨), abc,mp3(안됨) 확장자가 중요
		// test.abc.gif,abc.mp3

		Scanner sc = new Scanner(System.in);
		System.out.println("파일 형식을 입력하세요");
		String name = sc.next(); // abc.gif

		int i = name.lastIndexOf(".");

		String result = name.substring(i + 1);
		System.out.println(result);

	}

	public void ex4() {
		// id 입력 - 이메일 형식, @
		// 최대 10글자 이하로 만,
		Scanner sc = new Scanner(System.in);

		boolean check1 = false; // 길이가 맞는지 여부
		boolean check2 = false; // 이메일 형식 여부

		System.out.println("아이디 입력");
		String id = sc.next();

		if (id.length() < 11) {
			check1 = true;
		}
		int index = id.indexOf("@");
		if (index != -1) {
			check2 = true;
		}
		if (check1 && check2) {
			System.out.println("쓸 수 있는 ID");
		} else {
			System.out.println("쓸 수 없는 ID");
		}
	}

	public void ex3() {

		// 문자열을 입력 받고
		// 전보 글자당 100원 5개면 500원
		// 총 가격은?
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력");
		String str = sc.next();
		int result = str.length() * 100;
		System.out.println("총 가격 : " + result);
	}

	// i 글자가 몇개 있습니까?
	public void ex2() {
		String name = "Mississippi";
		int i = -1; // index
		int count = 0;
		while (true) {
			i = name.indexOf("s", i + 1);
			if (i != -1) {
				count++;
			} else {
				break;
			}
		} // while 끝
		System.out.println("Count : " + count);
	}

	public void ex1() {

		// ex1 리턴은 void
		// 주민번호 입력 991224-1234567
		// 남자 여자 판별

		Scanner sc = new Scanner(System.in);

		System.out.println("주민 번호 입력");
		String social = sc.next();
		char ch = social.charAt(7);

		System.out.println('1' + 1);

		if (ch == '1' || ch == '3' || ch == '5') {
			System.out.println("Man");
		} else {
			System.out.println("Woman");
		}
	}
}