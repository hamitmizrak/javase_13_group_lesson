package com.ecodation.a16.inheritance_lesson;

public class InheritanceMain {
	
	public static void main(String[] args) {
		// instance
		Msi msi = new Msi();// parametresiz costructor
		msi.setComputerName("Gl75");
		msi.setComputerPrice(12);
		msi.computerFullPropert();// method
		System.out.println(msi);// toString
		
		System.out.println("********************************");
		
		// Asus
		Asus asus = new Asus("asus", 55, "yeşil");
		asus.computerFullPropert();
		System.out.println(asus);
		
	}
	
}
