package com.ecodation.a03.string;

import java.util.Random;

public class _09_Rastgele {
	
	public static void main(String[] args) {
		// Mathematics
		// Math sınıfı static bir sınıftır
		System.out.println("rastgele değer\t\t\t:" + Math.round(Math.random() * 3 + 1));
		
		// Random objesi: java.util paketinden
		Random rastgele = new Random();
		int sayi = rastgele.nextInt(3) + 1;
		System.out.println("rastgele değer\t\t\t:" + sayi);
	}
	
}
