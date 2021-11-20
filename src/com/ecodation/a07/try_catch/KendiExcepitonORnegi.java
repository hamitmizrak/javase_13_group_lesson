package com.ecodation.a07.try_catch;

public class KendiExcepitonORnegi {
	
	public static void main(String[] args) throws HamitMizrakException {
		
		int sayi = -5;
		
		if (sayi < 0) {
			throw new HamitMizrakException("Sıfırdan küçük giremezsin");
		} else {
			System.out.println("sayınız sıfırdan büyük pozitif sayıdır");
		}
		
	}
	
}
