package com.rjm.util.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTest_2 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(25);
		ar.add(12);
		ar.add(36);
		ar.add(9);

//		ar.toArray() // 배열로 바꿔줌 (딱히 쓸일없음)

		Collections.sort(ar);
		Collections.reverse(ar);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}

}
