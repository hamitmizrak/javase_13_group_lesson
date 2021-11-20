package com.ecodation.optional;

public class _ucnokta {
	
	public static void deneme1(int... dizi) {
		System.out.println(dizi[0]);
	}
	
	public static void deneme2(int[] dizi) {
		System.out.println(dizi[0]);
	}
	
	public static void main(String[] args) {
		int[] sayi = { 3, 4, 5, 6 };
		deneme1(sayi);
		deneme2(sayi);
	}
}
