package com.ecodation.a28.generics.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListContinuesTutorials {
	public static void main(String[] args) {
		List<String> listem = new ArrayList<String>();
		listem.add("Amed");
		listem.add("Ekin");
		listem.add("Eray");
		listem.add("Kezban");
		listem.add("Neşe");
		listem.add("Hamit");
		listem.add("Hamit");
		
		// iterative for
		for (int i = 0; i < listem.size(); i++) {
			System.out.print((i + 1) + "." + listem.get(i) + " ");
		}
		System.out.println("\n*****************************************");
		// özel döngü
		int count = 0;
		for (String temp : listem) {
			count++;
			System.out.print(count + "." + temp + " ");
		}
		System.out.println("\n*****************************************");
		Iterator iterator = listem.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println("\n*****************************************");
		listem.forEach(System.out::print);
	}
}
