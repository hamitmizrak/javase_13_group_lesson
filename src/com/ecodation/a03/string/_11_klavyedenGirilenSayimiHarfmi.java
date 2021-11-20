package com.ecodation.a03.string;

import java.util.Scanner;

public class _11_klavyedenGirilenSayimiHarfmi {
	
	public static void main(String[] args) {
		//
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen simge giriniz.");
		String str = klavye.nextLine();
		
		char isKeyword = str.charAt(0);
		if (Character.isDigit(isKeyword)) {
			System.out.println("Bu sayıdır");
		} else if (Character.isLetter(isKeyword)) {
			System.out.println("Bu harftir");
		} else {
			System.out.println("Bu özel bir simgedir");
		}
	}
	
}
