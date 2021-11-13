package com.ecodation.a3.string;

import java.util.Scanner;

public class _05_Scanner3 {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		// int ifadeden sonra kelime girdim bir sıkıntım oluyor
		System.out.println("Lütfen sayı giriniz");
		int sayi2 = klavye.nextInt();
		
		// eğer sayıdan sonra String girilecekse klavye.nextLine() yazalım
		klavye.nextLine();
		
		System.out.println("Lütfen kelime giriniz");
		String kelime2 = klavye.nextLine();
		
		System.out.println("girdiğiniz sayı: " + sayi2);
		System.out.println("girdiğiniz kelime: " + kelime2);
		
	}
	
}
