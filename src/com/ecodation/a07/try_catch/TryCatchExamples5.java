package com.ecodation.a07.try_catch;

// import java.util.*; ==> util paketindeki bütün metotları çağır

public class TryCatchExamples5 {
	
	public static void main(String[] args) {
		
		System.out.println("1.satır");
		String hatameydanaGelsin = "istisna meydana gelsin";
		System.out.println(hatameydanaGelsin);
		// istisna zorunluluğu olsun yapay istisna oluşturmak istiyorsam
		throw new ArithmeticException("Yanlış yaptınız");
		// System.out.println("son satır");
		
	}
	
}
