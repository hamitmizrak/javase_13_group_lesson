package com.ecodation.a31.stream;

import java.util.Arrays;

public class WhatIsStream {
	// Stream API: dizilerimizi,Listlerimizi daha az kod yazarak çok iş yapabilme
	// yeteneğine diyebiliriz.
	// stream() ==> akış demektir.
	
	public static void main(String[] args) {
		String[] normalDizi = { "Malatya", "Elazığ", "Diyarbakır", "Sivas", "Ankara", "Bolu" };
		
		Arrays.sort(normalDizi);
		
		// iterative for
		for (int i = 0; i < normalDizi.length; i++) {
			System.out.print(normalDizi[i] + " ");
		}
		
		System.out.println("\n********************************************");
		
		// özel for ile çağıralım: bize indis lazım değilse
		for (String temp : normalDizi) {
			System.out.print(temp + " ");
		}
		System.out.println("\n********************************************");
		// Method references,
		Arrays.asList(normalDizi).stream().forEach(System.out::println);
		
	}
}
