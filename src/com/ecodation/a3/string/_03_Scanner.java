package com.ecodation.a3.string;

import java.util.Scanner;

public class _03_Scanner {
	
	public static void main(String[] args) {
		
		// JOptionPane.showInputDialog kullanıcı ile etkileşimli swing kütüphanesidir.
		// String kelime2 = JOptionPane.showInputDialog("Lütfen kelime Giriniz");
		
		// Java,JSP,JSF,SpringBoot,SpringMVC,SpringData,SpringCore,Hibernatek
		
		// kullanıcı ile etkileşimli yapılardır.
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen kelime giriniz");
		String kelime2 = klavye.nextLine();
		
		// Önemli Not:
		// Scanner: byte,short,int,long,float,double,boolean,String(next() veya
		// nextLine())
		// sadece: char yoktur onuda : char c1 = kelime2.charAt(0);
		// char c1 = kelime2.charAt(0);
		
		// 1-) length,trimlilength
		int elamanSAyisi = kelime2.length();
		System.out.println(elamanSAyisi);
		System.out.println(kelime2.trim().length());
		
		// 2-) hepsini küçük harfe çevirin
		System.out.println(kelime2.toLowerCase());
		
		// 3-) hepisinin büyük karakterlere çevirelim
		System.out.println(kelime2.toUpperCase());
		
		// 4-) içeriği dolu mu
		System.out.println(kelime2.isEmpty());
		
		// 5-) J ile mi başlıyor
		System.out.println(kelime2.startsWith("J"));
		
		// 6-) e ile mi bitiyor
		System.out.println(kelime2.endsWith("e"));
		
		// 7-) kelime2 sonuna HamitMızrak
		System.out.println(kelime2.concat(" -HamitMızrak"));
		System.out.println(kelime2 + " -HamitMızrak");
		
		// 8-) kelime2 ilk karakter ile 5 karakteri gösterin
		// Java,
		System.out.println(kelime2.substring(0, 5)); // 0<=x<= (5-1)
		
		// 9-) kelime2 cümlesinin içeriğini kendi isim ve soyismimizle değiştirelim.
		System.out.println(kelime2.replace(kelime2, "HamitMızrak"));
		
		// 10-) kelime2 ilk karakterini gösterin
		System.out.println(kelime2.charAt(0));
		
		// 11-) kelimenin son karakterini
		System.out.println(kelime2.length());
		System.out.println(kelime2.charAt(64));
		System.out.println(kelime2.charAt(kelime2.length() - 1));
		
		// 12-) kelime2 içeriğinde JSF geçiyor mu
		System.out.println(kelime2.contains("JSF"));
		
		// split
		String[] dizi2 = kelime2.split(",");
		for (String temp : dizi2) {
			System.out.println(temp + " ");
		}
		
		// equals
		System.out.println(kelime2.equals("JAVA,JSP,JSF,SpringBoot,SpringMVC,SpringData,SpringCore,Hibernatek"));
		System.out.println(
				kelime2.equalsIgnoreCase("JAVA,JSP,JSF,SpringBoot,SpringMVC,SpringData,SpringCore,Hibernatek"));
		
		klavye.close();
		// ÖnemliNot: eğer birden fazla Scanner oluşturacaksanız mutlaka1.scanner
		// kapatın
		Scanner klavye2 = new Scanner(System.in);
		
	}
	
}
