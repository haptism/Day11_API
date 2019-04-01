package com.rjm.lang.string;

public class StringTest_1 {

	public static void main(String[] args) {

		System.out.println(String.CASE_INSENSITIVE_ORDER);

		String s1 = "iu"; // 차이 1
		String s2 = "iu"; // true
		String s3 = new String("iu"); // 차이 2
		String s4 = new String("iu"); // 주소가 다르기 때문에 다르다. false

		// 메모리 영역에 상수 구간이 만들어짐

		System.out.println(s3.equals(s4)); // equals로 인해 true
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);

		String str = "abc";

		char data[] = { 'a', 'b', 'c' };
		String str2 = new String(data);

		System.out.println("abc");
		String cde = "cde";
		System.out.println("abc" + cde);
		String c = "abc".substring(2, 3);
		String d = cde.substring(1, 2);

		String s = "Strings are immutable"; // charAt 구문
		char result = s.charAt(8);
		System.out.println(result);
		
		
		str = "choa";
		int l = str.length(); // isEmpty
		System.out.println(l); // 문자열의 길이를 리턴하는 length

	}
}
