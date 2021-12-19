package com.ecodation.a28.generics.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class _2_Kume {
	/*
	 * H-L-T
	 * H=HashSet
	 * L=LinkedHashSet**
	 * T=TreeSet
	 */
	
	public static void main(String[] args) {
		Set<String> listem = new LinkedHashSet<String>();
		listem.add("Amed");
		listem.add("Ekin");
		listem.add("Eray");
		listem.add("Kezban");
		listem.add("Neşe");
		listem.add("Hamit");
		listem.add("Hamit");
		listem.add("Hamit");
		listem.add("Hamit");
		listem.add("Hamit");
		listem.add("Hamit");
		
		System.out.println(listem.size());
		int count = 0;
		for (String temp : listem) {
			count++;
			System.out.print(count + "." + temp + " ");
		}
	}
	
}
