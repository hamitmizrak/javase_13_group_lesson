package com.ecodation.a10.diziler;

public class SingleArray3 {
	
	public static void main(String[] args) {
		// System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 +
		// 1000);
		
		// dizilerde aynı türdeki verileri sabit bir yerde kullanılması durumudur.
		// String[4] ==> 4 elemanlı bir dizidir
		// diziler o(sıfır) indisinden başlar
		// 4-1=3 enfazla vereceğim değer
		// lang.ArrayIndexOutOfBoundsException : dizide olmayan elemana ulaşmaya
		// çalışıyorsunuz
		
		// object: çağırmak biraz masraflıdır.
		Object[] dizi = { "Java", "JSP", "Spring", "JSF", "E.L" };
		
		// iterative for: index yani i lazımsa kullaıyorsunuz
		// length: eleman sayısı
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		
		System.out.println("\n***********");
		
		// forEach
		for (Object temp : dizi) {
			System.out.print(temp + " ");
		}
		
	}
	
}
