package com.rjm.lang;

public class Object_1_Object {

	public static void main(String[] args) {

		// Object 클래스의 객체 생성
		// 클래스명 참조변수명 = new 생성자()
		// 참조변수명.멤버변수명
		// 참조변수명.멤버메서드명()

		Object obj = new Object();
		Object obj2 = new Object();

		// 접근지정자 그외지정자 리턴타입 메서드명([매개변수 선언])

		boolean c = obj.equals(obj2);
		System.out.println(c);

		System.out.println(obj == obj2);

		String s = obj.toString();
		System.out.println(s);

		int h = obj.hashCode();
		System.out.println(h);

		String ss = "hellow world";
		int n = ss.indexOf("l", 5);
		System.out.println("N : " + n);

		ss = "hellow world";
		String r = ss.substring(7);
		System.out.println(r);
		r = ss.substring(3, 5);
		System.out.println(r);

	}

	public void ex2() {
		String name = "Mississippi";

		name.indexOf("i");
		
		

	}
}
