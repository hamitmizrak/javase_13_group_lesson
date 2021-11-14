package com.ecodation.a7.try_catch;

import java.io.IOException;

// import java.util.*; ==> util paketindeki bütün metotları çağır

public class TryCatchExamples4 {
	
	public static void deneme() throws ArithmeticException, ArrayIndexOutOfBoundsException, IOException {
		// try-catch-throw-throws-finally
		System.out.println("1.satır");
		int sayi = 4 / 0;
		System.out.println("son satır");
	}
	
	public static void main(String[] args) {
		try {
			deneme();
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | IOException e) {
			e.printStackTrace();
		}
	}
	
}
