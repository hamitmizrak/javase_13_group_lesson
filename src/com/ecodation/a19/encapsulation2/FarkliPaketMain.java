package com.ecodation.a19.encapsulation2;

import com.ecodation.a19.encapsulation1.EncapsulationClass;

public class FarkliPaketMain {
	
	public static void main(String[] args) {
		
		// instance
		EncapsulationClass encap = new EncapsulationClass();
		encap.setCimri("Cimri misin");
		System.out.println(encap.getCimri());
	}
	
}
