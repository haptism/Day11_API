package com.rjm.lang.string.string.ex1;

import java.util.Scanner;

public class WeatherInit {

	private String info;

	public WeatherInit() {
		info = "seoul ,맑음 ,10 ,20 ,0.3 ,deajeon ,비 ,-22 ,50 ,0.1," + "incheon ,태풍 ,56 ,90 ,22.2 ,jeju ,흐림 ,15 ,10 ,1.2";
	}

	public Weather[] getWethers() {

		String[] ar = info.split(",");
		Weather[] weathers = new Weather[ar.length / 5];
		int index = 0;
		for (int i = 0; i < weathers.length; i++) {
			Weather w = new Weather();
			w.setCity(ar[i]); // 0 5
			w.setState(ar[++i]); // 1 6
			w.setTem(ar[++i]);
			w.setHum(ar[++i]);
			w.setFine(ar[++i]);
			weathers[index] = w;
			index++;
		}
		index = 0;
		for (int i = 0; i < weathers.length; i = i + 5) {
			Weather w = new Weather();
			w.setCity(ar[i]); // 0 5
			w.setState(ar[i + 1]); // 1 6
			w.setTem(ar[i + 2]);
			w.setHum(ar[i + 3]);
			w.setFine(ar[i + 4]);
			weathers[i] = w;
//			index++;
		}
		return weathers;
	}
}
