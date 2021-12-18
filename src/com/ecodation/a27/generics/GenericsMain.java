package com.ecodation.a27.generics;

public class GenericsMain {
	
	public static void main(String[] args) {
		
		GenericsTutorials genericsTutorials = new GenericsTutorials("Hamit", '\u5253');
		System.out.println(genericsTutorials);
		genericsTutorials.normalMethod("Hamit");
		genericsTutorials.genericsMethod(52525L);
		
	}
	
}
