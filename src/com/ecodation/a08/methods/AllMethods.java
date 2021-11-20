package com.ecodation.a08.methods;

public class AllMethods {
	
	// Java By pass valuemi ? yoksa Java By pass referances ?
	// evet value'dir
	
	// java : 4 methods vardır.
	// methods ne işe yarar: sürekli kullandığımız veya kullancağımız algoritmalarda
	// kullanıyoruz.
	// clean codes
	// hafıza kontrolu ,kodlarımızın daha düzenli olmasını sağlar
	// zamandan kazanç sağlarız.
	
	// 1-) parametresiz Voidli
	// public: her yerden erişim sağlanacak
	// void:geriye bir şey döndermiyor.
	// parametresizVoidli: method adıdır.
	public static void parametresizVoidli() {
		System.out.println("parametresiz voidli metodum");
		int sayi = 5;
		int sayi2 = 2;
		System.out.println(sayi + sayi2);
	}
	
	// 2-) parametreli Voidli
	// public: her yerden erişim sağlanacak
	// void:geriye bir şey döndermiyor.
	// parametreliVoidli: method adıdır.
	// () ==> parametredir. Dış dünyadan gelen verileri almak istiyorsak
	// parametreye: isterseniz primitive isterseniz wrapper classlar yazabilirsiniz
	public static void parametreliVoidli(String adi, String soyadi) {
		System.out.println("\nparametreli voidli metodum");
		System.out.println("adınız: " + adi + " soyadınız: " + soyadi);
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////
	// void ile return birbirine terstir birbirini sevmez
	// 3-) parametresiz Voidsiz
	public static String voidsizParametresiz() {
		return "\nvoidsiz parametresiz" + " Hamit" + "Mızrak";
	}
	
	// 4-) parametreli Voidsiz
	public static String voidsizParametreli(String adi, String soyadi) { // parametredir.
		return "\nvoidsiz parametreli " + adi + soyadi;
	}
	
	// psvm: yoksa kodlar çalışmaz
	public static void main(String[] args) {
		parametresizVoidli();
		parametreliVoidli("Hamit", "Mızrak"); // argüman
		
		String deneme1 = voidsizParametresiz();
		System.out.println(deneme1);
		
		String deneme2 = voidsizParametreli("\tHamit", "\tMızrak");
		System.out.println(deneme2);
		
		// parametre nedir ? :method oluştururken kullanırız
		// argüman nedir ? : metodu çağırken kullanıyorsak
	}
	
}
