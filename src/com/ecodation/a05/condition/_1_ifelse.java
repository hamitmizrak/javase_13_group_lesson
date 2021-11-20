package com.ecodation.a05.condition;

public class _1_ifelse {
	public static void main(String[] args) {
		int sayi = 5;
		if (sayi == 3) {
			System.out.println("Sayı 3");
		} else {
			System.out.println("Sayı 5");
		}
		
		// Ternary: sadece 2 tane karar varsa kulalnabiliriz.
		String tern = (sayi == 3) ? "Sayı 3" : "Sayı 5";
		System.out.println(tern);
		
		/////////////////////////////
		
		System.out.println("*************************************");
		// if=eğer
		// else if =değilse
		// else= artık budur.
		if (sayi == 1) {
			System.out.println("Sayı 1");
		} else if (sayi == 2) {
			System.out.println("Sayı 2");
		} else if (sayi == 3) {
			System.out.println("Sayı 3");
		} else if (sayi == 4) {
			System.out.println("Sayı 4");
		} else if (sayi == 5) {
			System.out.println("Sayı 5");
		} else {
			System.out.println("sayı farklıdır");
		}
	}
}
