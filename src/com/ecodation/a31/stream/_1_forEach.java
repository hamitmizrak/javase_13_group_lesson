package com.ecodation.a31.stream;

import java.util.Arrays;
import java.util.List;

public class _1_forEach {
	
	public static void main(String[] args) {
		// 1.Yol
		String[] dizi = { "Malatya ", "Ankara ", "Nevşehir ", "Bitlis ", "Bursa " };
		List<String> listem = Arrays.asList(dizi);
		listem.stream().forEach(System.out::print);
		
		System.out.println("\n*******************************************************");
		
		// 2.YOL
		List<String> listem2 = Arrays.asList("Malatya ", "Ankara ", "Nevşehir ", "Bitlis ", "Bursa ");
		listem2.stream().forEach(System.out::print);
	}
}
