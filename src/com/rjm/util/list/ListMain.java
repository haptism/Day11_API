package com.rjm.util.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		// 1,2,3,4
		Object e = "";// 다형성
		ar.add("1");
		ar.add(2); // int -> Integer : autoBoxing
		ar.add(3.12);// double -> Double
		ar.add('a');// char -> Character

		ar.add(1, "2000");
		ar.set(1, "500");
		// ar.clear();
		// ar.remove(1);
		// ar.remove("2");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}

}