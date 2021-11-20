package com.ecodation.a10.diziler;

import java.util.Arrays;

public class DizilerdeArrays {
	
	public static void main(String[] args) {
		int[] dizi = { 4, 6, 9, 5 };
		
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		
		// Arrays.sort
		System.out.println("\n*****************");
		Arrays.sort(dizi); // küçükten büyüğe sıralama yapmak
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		
		// Arrays BinarySearch
		System.out.println("\n*****************");
		// araması bakmak
		if (Arrays.binarySearch(dizi, 599) < 0) {
			System.out.println("Aradığınız sayı yoktur");
		} else {
			System.out.println("Aradığınız sayı bulunuyor");
		}
		
		// Array.equals
		
		System.out.println("\n*****************");
		// araması bakmak
		if (Arrays.equals(dizi, dizi)) {
			System.out.println("iki dizide birebir aynıdır");
		} else {
			System.out.println("iki dizi birbirinden farklıdırrr.");
		}
		
	}
	
}
