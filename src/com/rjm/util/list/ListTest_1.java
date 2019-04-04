package com.rjm.util.list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListTest_1 {

	public static void main(String[] args) {
		ListTest_1 li = new ListTest_1();
		li.ex1();
	}

	public void ex2() {

	}

	public void ex1() {
		// 숫자를 입력 받아서 - 3
		// 해당 숫자 만큼 랜덤한 숫자를 3개를 생성해서
		// List에 추가하고 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 ");
		int num = sc.nextInt();
		Random random = new Random();
		ArrayList ar = new ArrayList();
		for (int i = 0; i < num; i++) {
			int number = random.nextInt();
			ar.add(number);
		}

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}

}