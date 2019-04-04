package com.rjm.util.random;

import java.util.Random;

public class RandomEx1 {

	public void ex4() {

		// RPG
		// Lineage : 0 -> 1
		// 10% 확률로 3단계 성공
		// 20% 확률로 2단계 성공
		// 30% 확률로 1단계 성공
		// 40% 확률로 실패

		Random random = new Random();

		int[] nums = { 0, 0, 0, 1, 0, 2, 0, 1, 0, 0, };

		int index = random.nextInt(nums.length);
		int num = nums[index];

		if (num == 0) {
			System.out.println("실패 현질");
		} else {
			System.out.println(num + "강화 성공");
		}

//		Random r = new Random();
//
//		System.out.println("강화율 : " + r.nextInt(100) + "%");
//
//		if (new Random().nextInt(100) < 30) { // 30%에 걸리면 호출
//			System.out.println("3단계 성공");
//		}
//		if (new Random().nextInt(100) < 20) { // 20%에 걸리면 호출
//			System.out.println("2단계 성공");
//		}
//		if (new Random().nextInt(100) < 10) { // 10%에 걸리면 호출
//			System.out.println("1단계 성공");
//		} else if (new Random().nextInt(10) < 0)
//			System.out.println("강화 실패");

	}

	public void ex3() {

		Random random = new Random();

		String[] foods = { "떡볶이", "냉면", "순대국", "육개장", "해장국" };

		int index = random.nextInt(foods.length);

		System.out.println(foods[index]);

	}

	public void ex2() {
		// 1 ~45 번까지의 숫자를 6개
		Random random = new Random();
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}

		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		// 출력
	}

	public void ex1() {

		// 6개 숫자가 출력
		// 1~45번 출력
		
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println(random.nextInt(44) + 1);
		}

	}

}