package com.ecodation.a31.stream;

import java.util.ArrayList;
import java.util.List;

public class _ListToArray {
	
	// toArray : normal diziye çevirmek
	
	// Liste ==> Diziyi çevirmek
	public static String[] listToArray(List<String> list) {
		String[] normalDizi = new String[list.size()];
		return list.toArray(normalDizi);
	}
	
	public static void main(String[] args) {
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya");
		listem.add("İstanbul");
		
		listToArray(listem);
		System.out.println(listToArray(listem));
		for (String temp : listToArray(listem)) {
			System.out.print(temp + " ");
		}
		System.out.println("\n**************************");
		System.out.println(listToArray(listem).toString());
	}
	
}
