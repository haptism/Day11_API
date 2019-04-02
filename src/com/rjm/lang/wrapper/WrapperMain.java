package com.rjm.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {

//		Wrapper_ex1 w1 = new Wrapper_ex1();

		Wrapper_ex2 w2 = new Wrapper_ex2();
		
		Wrapper_ex3 w3 = new Wrapper_ex3();
		

//		w1.ex1();
//		w1.ex2();

//		w2.ex1();

		w3.ex1();

		Integer n1 = new Integer(10);
		int num = n1.intValue();
		num = n1; // autoUnBoxing
		n1 = 20; // autoBoxing

		n1 = (int) 20.3; // String 타입이여서 안됨
		Double d = 20.3;
		String s1 = "iu";
		String s2 = "choa";
		System.out.println(s1.hashCode());

		s1 = s1 + s2;

		System.out.println(s1.hashCode());
		System.out.println("1" + "2" + "3" + "4"); // 7개의 객체 필요 (불필요함)

		StringBuffer s = new StringBuffer();
		System.out.println(s.hashCode());
		s.append("iu");
		System.out.println(s.hashCode());
		s.append("choa");

		System.out.println(s.toString());
		String name = s.toString();

		double d1 = 3.44;
		d1 = Math.ceil(d1); // 올림
		System.out.println(d1);
		d1 = 3.54;
		d1 = Math.floor(d1); // 내림
		System.out.println(d1);
		d1 = 3.44;
		d1 = Math.round(d1); // 반올림
		System.out.println(d1);

		d1 = Math.random();
		System.out.println("Random " + d1);

//		int num = -2;
//		System.out.println(Integer.toBinaryString(num));
//		System.out.println(Integer.toOctalString(num));
//		System.out.println(Integer.toHexString(num));

	}

}
