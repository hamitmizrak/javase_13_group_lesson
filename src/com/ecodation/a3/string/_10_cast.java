package com.ecodation.a3.string;

public class _10_cast {
	
	public static void main(String[] args) {
		// cast: dönüşüm
		
		// 1-)fL
		float f1 = 4.55f;
		long l1 = 45541555L;
		
		// 2-) küçük bir değişkeni büyük değişkene eklemek: veri kaybı yoktur
		byte b2 = 125;
		long l2 = b2;
		
		// 3-) küçük bir değişkeni büyük değişkene eklemek: veri kaybı yoktur
		long l3 = 452655855555L;
		byte b3 = (byte) l3;
		
		// 4-)boxing:primitive türü wrapper classa benzettik
		int sayi1 = 44;
		Integer sayi2 = sayi1;
		System.out.println(sayi2);
		
		// 4-)unboxing: wrapper classı primitive türe benzettik
		Integer sayi3 = new Integer(55555);
		int sayi4 = sayi3;
		System.out.println(sayi4);
		
		// 5-) Stringten int'e çevirmek
		String str1 = "44";
		int sayi6 = Integer.valueOf(str1);// cast yaptım: nesne düzeydedir.
		int sayi7 = Integer.parseInt(str1);// cast yaptım
		int sayi5 = 16;
		System.out.println(sayi7 + sayi5);
		
		// 6-) int'ten String'e çevirmek
		int sayi8 = 25;
		String str2 = String.valueOf(sayi8);
		String str3 = Integer.toString(sayi8);
	}
	
}
