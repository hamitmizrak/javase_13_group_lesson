package com.ecodation.a7.try_catch;

// import java.util.*; ==> util paketindeki bütün metotları çağır

public class TryCatchExamples3 {
	
	public static void main(String[] args) {
		
		// try-catch-throw-throws-finally
		System.out.println("1.satır");
		
		// exception handling
		try {
			int sayi = 4 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}
		
		System.out.println("son satır");
	}
	
}
