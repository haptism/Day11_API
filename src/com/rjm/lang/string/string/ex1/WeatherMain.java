package com.rjm.lang.string.string.ex1;

import java.io.ObjectInputStream.GetField;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherInit wi = new WeatherInit();
		Weather[] weathers = wi.getWethers();

		for (int i = 0; i < weathers.length; i++) {
			System.out.println("도시 : " + weathers[i]);
			System.out.println("상태 : " + weathers[i]);
		}
	}
}
