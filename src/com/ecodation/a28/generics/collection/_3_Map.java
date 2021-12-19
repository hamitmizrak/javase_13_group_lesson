package com.ecodation.a28.generics.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _3_Map {
	/*
	 * H-H-L-T
	 * H=HashTable
	 * H=HashMap**
	 * L=LinkedHashMap
	 * T=TreeMap
	 */
	// key-value
	public static void main(String[] args) {
		Map<Integer, Object> listem = new HashMap<Integer, Object>();
		listem.put(1, "Amed");
		listem.put(2, "Ekin");
		listem.put(3, "Eray");
		listem.put(4, "Kezban");
		listem.put(5, "Neşe");
		listem.put(6, "Hamit");
		
		for (Integer temp : listem.keySet()) {
			System.out.print(temp + " ");
		}
		System.out.println("\n*********************************");
		
		for (Object temp : listem.values()) {
			System.out.print(temp + " ");
		}
		System.out.println("\n*********************************");
		
		Set set = listem.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(listem.get(iterator.next()));
		}
		System.out.println("***********************");
		// 1
		listem.entrySet().forEach(System.out::print);
		
	}
}
