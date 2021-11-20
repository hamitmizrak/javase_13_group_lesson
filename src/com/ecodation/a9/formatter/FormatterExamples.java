package com.ecodation.a9.formatter;

public class FormatterExamples {
	
	public static void main(String[] args) {
		// C ve C++ dillerden miras almıştır
		// C=Syntax olarak
		// C++ = OOP olarak benzer
		
		// SeDeF
		// String ==> Kelimelerden oluşur
		String kelime = "Java dersleri";
		
		// Decimal ==> 10 luk sayı sistemi
		int onlukSayi = 44;
		
		// float ==> virgüllü sayılar
		float virgulluSayi = 13344.55f;
		System.out.printf("%s %f %d", kelime, virgulluSayi, onlukSayi);
		System.out.println("\n**********************************************");
		System.out.printf("%S %f %d", kelime, virgulluSayi, onlukSayi);
		System.out.println("\n**********************************************");
		
		// .3f= virgülden sonra 3 basamağı göster
		System.out.printf("%S %.3f %d", kelime, virgulluSayi, onlukSayi);
		System.out.println("\n**********************************************");
		
		// .3f= virgülden sonra 3 basamağı göster
		System.out.printf("%S %.0f %d", kelime, virgulluSayi, onlukSayi);
		System.out.println("\n**********************************************");
		
		java.util.Date tarih = new java.util.Date();
		// sonuna %n yazarsam yeni gelenecek veri alt satıra geçer.
		// %t%T=tarih anlamına gelmektedir
		
		System.out.printf("%tT%n", tarih);
		
		// %24s ==> sağa ötelemek
		// %-20s ==> sola ötelemek
		System.out.printf("%S %.0f %d%n", kelime, virgulluSayi, onlukSayi);
		System.out.printf("%24s %.0f %d", kelime, virgulluSayi, onlukSayi);
		System.out.printf("%44s %.0f %d", kelime, virgulluSayi, onlukSayi);
		System.out.printf("%-20s %.0f %d", kelime, virgulluSayi, onlukSayi);
		
	}
}
