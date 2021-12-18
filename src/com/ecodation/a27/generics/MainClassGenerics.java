package com.ecodation.a27.generics;

public class MainClassGenerics {
	
	public static void main(String[] args) {
		EcodationGenerics ecodationGenerics = new EcodationGenerics("adi", "soyadi");
		System.out.println(ecodationGenerics);
		ecodationGenerics.deneme("Hamit", "Mızrak", "normal");
		ecodationGenerics.denemeGenerics("Hamit", "Mızrak", "generics");
		
	}
	
}
