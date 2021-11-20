package com.ecodation.a03.string;

public class _01_StringTutorials {
	
	public static void main(String[] args) {
		/*
		 * String: database, socket,servis v.b
		 * primitive type: byte short int long float double char boolean (fL) :stack
		 * wrapper class:Byte Short Integer Long Float Double Character Boolean String :
		 * Heap
		 */
		
		// String: kelimelerden ibarettir.
		String kelime = "Java'nın Geleceğinde Büyük İnsanlar ";
		System.out.println("harf sayısı: " + kelime.length());
		System.out.println("harf sayısı: " + kelime.trim().length());
		System.out.println("harf büyük: " + kelime.trim().toUpperCase());
		System.out.println("harf küçük: " + kelime.trim().toLowerCase());
		
		System.out.println("charAt: " + kelime.charAt(1)); // ben sana sayı vereyim sen bana harf dönder
		System.out.println("indexOf: " + kelime.indexOf("J"));
		
		System.out.println(kelime.substring(5)); // parçalamaktır sadece ilgili yeri almak
		System.out.println(kelime.substring(1, 5)); // parçalamaktır sadece ilgili yeri almak
		
		System.out.println(kelime.replace(kelime, "Merhabalar")); // değiştirmek (eskisi,yenisi)
		
		System.out.println("böyle bir kelime var mı? " + kelime.contains("Java"));
		
		System.out.println("bununla mı başlıyorsun: " + kelime.startsWith("J"));
		System.out.println("bununla mı bitiyorsun: " + kelime.endsWith(" "));
		
		System.out.println(kelime + "-sonuna ekledim");
		System.out.println(kelime.concat("-sonuna ekledim"));
		System.out.println(kelime.trim().concat("-sonuna ekledim"));
		System.out.println(kelime.trim().concat("-sonuna ekledim").toUpperCase());
		System.out.println(kelime.trim().concat("-sonuna ekledim").toUpperCase().length());
		
		System.out.println("bu nesne dolu mu boşmu? " + kelime.isEmpty());
		// bu nesne dolu mu boşmu
		// doluysa: false boşsa:true
		
		// equals
		// ==
		// !=
		System.out.println("eşit mi: " + kelime.equals("Java'nın Geleceğinde Büyük İnsanlar "));
		
		// istediğim karektere göre parçaladım
		String[] dizi = kelime.split(" ");
		for (String temp : dizi) {
			System.out.println(temp + " ");
		}
		
		// örnek:
		// kelimemiz:Java,JSP,JSF,SpringBoot,SpringMVC,SpringData,SpringCore,Hibernate
		String kelime2 = "Java,JSP,JSF,SpringBoot,SpringMVC,SpringData,SpringCore,Hibernatek";
		
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
		
	}
	
}
