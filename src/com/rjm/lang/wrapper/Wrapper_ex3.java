package com.rjm.lang.wrapper;

public class Wrapper_ex3 {
	
	public static void main(String[] args) {
		
		new Wrapper_ex3().ex1();

	}

	public void ex1() {
		
		// random 발생
		// 0 ~9 사이의 정수를 반환
		
		double num = Math.random();// 0.0~1.0미만
		int result = (int) (num * 10);
		System.out.println(result);

	}

}