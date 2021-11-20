package com.ecodation.a10.diziler;

public class SingleArray {
	
	public static void main(String[] args) {
		// System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 +
		// 1000);
		
		// dizilerde aynı türdeki verileri sabit bir yerde kullanılması durumudur.
		// String[4] ==> 4 elemanlı bir dizidir
		// diziler o(sıfır) indisinden başlar
		// 4-1=3 enfazla vereceğim değer
		String[] dizi = new String[4];
		dizi[0] = "Java";
		dizi[3] = "JSP";
		dizi[1] = "Spring";
		
		// iterative for: index yani i lazımsa kullaıyorsunuz
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		
		System.out.println("\n***********");
		
		// forEach
		for (String temp : dizi) {
			System.out.print(temp + " ");
		}
		
	}
	
}
