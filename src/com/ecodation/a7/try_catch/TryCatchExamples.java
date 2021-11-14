package com.ecodation.a7.try_catch;

// import java.util.*; ==> util paketindeki bütün metotları çağır

public class TryCatchExamples {
	
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("son satır");
	}
	
}
