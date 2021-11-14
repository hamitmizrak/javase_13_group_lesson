package com.ecodation.a5.condition;

import java.util.Scanner;

public class Examples2 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen sayı giriniz");
		
		int sayi = klavye.nextInt();
		
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
