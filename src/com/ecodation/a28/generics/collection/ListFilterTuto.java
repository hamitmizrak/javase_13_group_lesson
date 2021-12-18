package com.ecodation.a28.generics.collection;

import java.util.Arrays;
import java.util.List;

public class ListFilterTuto {
	
	public static void main(String[] args) {
		FilterStudent filter1 = new FilterStudent("Hamit", 36);
		FilterStudent filter2 = new FilterStudent("Amed", 25);
		FilterStudent filter3 = new FilterStudent("Hamit", 26);
		
		List<FilterStudent> filtreleme = Arrays.asList(filter1, filter2, filter3);
		for (FilterStudent temp : filtreleme) {
			if (temp.getYas() >= 26) {
				System.out.println(temp);
			}
		}
	}
}
