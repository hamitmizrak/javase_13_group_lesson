package com.ecodation.a25.oopexam;

public class PencilMainTest {
	
	public static void main(String[] args) {
		Rotring rotring = new Rotring(123, EPencilColor.mavi.toString(), "750", "12Kömür");
		System.out.println(rotring);
		
		System.out.println("**********************");
		
		Adel adel = new Adel(54, EPencilColor.mavi.toString(), "850", "456 spiral");
		System.out.println(adel);
	}
	
}
