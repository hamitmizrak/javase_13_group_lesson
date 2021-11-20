package com.ecodation.a04.tarih;

import java.util.Date;

public class TarihAndCalendar {
	
	public static void main(String[] args) {
		Date tarih = new Date();
		System.out.println(tarih);
		
		System.out.println("saniye\t\t: " + tarih.getSeconds());
		System.out.println("dakika\t\t: " + tarih.getMinutes());
		System.out.println("saat\t\t: " + tarih.getHours());
		
		tarih.setHours(23);
		System.out.println("saat\t\t: " + tarih.getHours());
		
	}
	
}
