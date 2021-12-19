package com.ecodation.a31.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _4_filter {
	
	// arrow function JS =>
	// arrow function Java ->
	
	// stream: başlangıç
	// collect: bitiş
	public static void main(String[] args) {
		
		// illerden Bolu olanları listeyelim.
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya");
		listem.add("İzmir");
		listem.add("Ankara");
		listem.add("Bolu");
		listem.add("Bolu");
		// ()->{}
		List<String> listem2 = listem.stream().filter((Bolu) -> "Bolu".equals(Bolu)).collect(Collectors.toList());
		listem2.forEach(System.out::print);
		System.out.println(" " + listem2.size());
		System.out.println("\n*************************************************************");
		
	}
}
