package com.ecodation.a28.generics.collection;

import java.util.ArrayList;
import java.util.List;

// L - A - V
// L=LinkedList: linkedin araya,sileyim
// A=ArrayList** arama,ekleme
// V=Vector 10
//
public class _1_Liste {
	
	public static void main(String[] args) {
		List<String> listem = new ArrayList<String>();
		listem.add("Amed");
		listem.add("Ekin");
		listem.add("Eray");
		listem.add("Kezban");
		listem.add("Neşe");
		listem.add("Hamit");
		
		// listem.remove(5);
		// listem.removeAll(listem);
		
		System.out.println(listem.contains("Neşe"));
		
		System.out.println("for Each döngüsü");
		for (String temp : listem.subList(0, 2)) { // 0<=x<2
			System.out.print(temp + " ");
		}
		
		System.out.println("\n***********************************");
		System.out.println("iterative for");
		if (!listem.isEmpty()) {
			System.out.println(listem.size());
			System.out.println(listem.get(0));
			for (int i = 0; i < listem.size(); i++) {
				System.out.print(listem.get(i) + " ");
			}
		}
		
	}
}
