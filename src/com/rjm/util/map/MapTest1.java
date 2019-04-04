package com.rjm.util.map;

import java.util.HashMap;

public class MapTest1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("n1", 1);
		map.put("number2", 2);
		
		System.out.println(map.get("n1"));
		
		map.put("n1", 3);//수정
		
		System.out.println(map.get("n1"));
		System.out.println(map);
		
		System.out.println(map.size());
		
		for(int i=0;i<map.size();i++) {
			System.out.println(map.get("n"+(i+1)));
		}

	}

}