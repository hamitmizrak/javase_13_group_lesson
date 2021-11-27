package com.ecodation.a12.solid;

import java.util.Random;
import java.util.Scanner;

public class GenelBilgiler {
	/*
	 * kullanıcı tarafından belirlenen rastgele sayıları diziye atan algoritma
	 * yazınız ?
	 */
	
	// pseudo code --> kaba kod
	// 1-) method --> arrayRandom: void(dizi:int)
	// 2-) Scanner veya JOptionPane(cast)
	// 3-) Random classını çağır
	// 4-) dizinin içine buradaki sayıları içine aktaracak
	
	public static void arrayRandom() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen random sayı adetini giriniz");
		int number = klavye.nextInt();
		Random random = new Random();
		
		int[] dizi = new int[number];
		
		for (int i = 0; i < number; i++) {
			int randomNumber = random.nextInt(9) + 1; // 1 <x<9
			dizi[i] = randomNumber;
		}
		arrayShow(dizi);
	}
	
	public static void arrayShow(int... dizi) {
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
	}
	
	public static void main(String[] args) {
		arrayRandom();
	}
	
}
