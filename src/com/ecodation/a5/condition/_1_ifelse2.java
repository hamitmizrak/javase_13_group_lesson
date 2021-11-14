package com.ecodation.a5.condition;

public class _1_ifelse2 {
	public static void main(String[] args) {
		
		int sayi = 5;
		
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
		
		System.out.println("*********************************************");
		// switch-case
		switch (sayi) {
			case 1: {
				System.out.println("Sayı 1");
				break;
			}
			case 2: {
				System.out.println("Sayı 2");
				break;
			}
			case 3: {
				System.out.println("Sayı 3");
				break;
			}
			case 4: {
				System.out.println("Sayı 4");
				break;
			}
			case 5: {
				System.out.println("Sayı 5");
				break;
			}
			
			default:
				System.out.println("Sayı farkldıır");
				break;
		}
	}
}
