package com.ecodation.a07.try_catch;

// import java.util.*; ==> util paketindeki bütün metotları çağır

public class TryCatchExamples2 {
	
	public static void main(String[] args) {
		// Annontation: meta 1.5 compiler ile java arasında bir köprü kurar
		// @Override
		// @Depracated
		
		// dikkat: try-catch her yerde kullanabilirsiniz.
		
		// try-catch-throw-throws-finally
		System.out.println("1.satır");
		
		// exception handling
		try {
			int sayi = 4 / 0;
		} catch (ArithmeticException ai) {
			ai.printStackTrace();
		} catch (Exception e) { // excepiton paketindeki bütün metotları çağır
			e.printStackTrace();
		}
		
		System.out.println("son satır");
	}
	
}
