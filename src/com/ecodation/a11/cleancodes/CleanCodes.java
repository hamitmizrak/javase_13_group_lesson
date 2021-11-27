package com.ecodation.a11.cleancodes;

public class CleanCodes {
	
	/*
	 * kodlarımızı yazarken herzaman için minumum düzeyde ve işimizi görecek şekilde
	 * kodlamalar yapalım
	 */
	// eğer ki yeni gelen projeye dahil olan kişi çok iyi anlıyorsa kodları
	// hafızayı şişirmeden
	// comment
	// method yazmak
	// non-dependent
	// OOP
	// design pattern
	// sürekli new kullanmamak (instance)
	
	public static void sum(int sayi1, int sayi2) {
		int sayi3 = sayi1 + sayi2;
		System.out.println("toplamları: " + sayi3);
	}
	
	public static void main(String[] args) {
		// iki sayı toplamını yapan algoritma
		sum(4, 5);
		
	}
	
}
