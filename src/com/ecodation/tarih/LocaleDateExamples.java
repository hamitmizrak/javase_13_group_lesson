package com.ecodation.tarih;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleDateExamples {
	/*
	 * Date depracated olmuştur. yani yeni sürümü bulunmaktadır. isterseniz yeni
	 * sürüm olan
	 * Calendar kullanabilirsiniz.
	 * Date bileşende 1900 eklemesi
	 */
	public static void main(String[] args) {
		java.util.Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss zzzz", locale);
		
		Date date = new Date();
		String str = dateFormat.format(date);
		
		// System.out.println(date);
		System.out.println(str);
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		java.util.Locale locale2 = new Locale("tr", "TR");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss zzzz", locale);
		
		Calendar calendar = Calendar.getInstance();
		String str2 = dateFormat2.format(calendar.getTime());
		// System.out.println(calendar.getTime());
		System.out.println(str2);
		
		/////////////////////////////////////////////////////////////////////////////////////////
		
		long zaman = System.currentTimeMillis();
		System.out.println(zaman);
		Date date3 = new Date(zaman);
		System.out.println(date3);
		
		///////////////////////////////////////////////////////////////////////////////////////
	}
	
}
