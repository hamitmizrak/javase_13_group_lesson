package com.ecodation.a3.string;

import java.util.Scanner;

public class _04_Scanner2 {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		// String ifadeden sonra sayı girdim bir sıkıntım olmadı
		System.out.println("Lütfen kelime giriniz");
		String kelime2 = klavye.nextLine();
		
		System.out.println("Lütfen sayı giriniz");
		int sayi2 = klavye.nextInt();
		
		System.out.println("girdiğiniz kelime: " + kelime2);
		System.out.println("girdiğiniz sayı: " + sayi2);
		
	}
	
}
