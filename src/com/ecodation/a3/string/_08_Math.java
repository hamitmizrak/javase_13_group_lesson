package com.ecodation.a3.string;

public class _08_Math {
	
	public static void main(String[] args) {
		// Mathematics
		// java.lang kütüphanesinden alırız.
		// Math sınıfı static bir sınıftır
		System.out.println("PI\t\t\t\t:" + Math.PI);
		System.out.println("E\t\t\t\t:" + Math.E);
		
		System.out.println("aşağı yuvarlamak\t\t:" + Math.floor(9.9));
		System.out.println("aşağı yuvarlamak\t\t:" + Math.ceil(9.1));
		System.out.println("yukarı aşağı yuvarlamak\t\t:" + Math.round(9.5));
		
		System.out.println("Mutlak değer\t\t\t:" + Math.abs(-4));
		System.out.println("üst değer\t\t\t:" + Math.pow(2, 5));
		System.out.println("karekök değer\t\t\t:" + Math.sqrt(16));
		
		System.out.println("minumum değer\t\t\t:" + Math.min(2, -5));
		System.out.println("maksimum değer\t\t\t:" + Math.max(2, -5));
		
		System.out.println("rastgele değer\t\t\t:" + Math.random());
		System.out.println("rastgele değer\t\t\t:" + Math.random() * 3 + 1);
		System.out.println("rastgele değer\t\t\t:" + Math.round(Math.random() * 3 + 1));
		
		// Math.random() * 3 ==> üst sınır
		
		System.out.println("sinüs değer\t\t\t:" + Math.sin(45));
	}
	
}
