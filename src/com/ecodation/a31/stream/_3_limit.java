package com.ecodation.a31.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _3_limit {
	
	// stream: başlangıç
	// collect: bitiş
	public static void main(String[] args) {
		
		// 1.örnek
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya");
		listem.add("İzmir");
		listem.add("Ankara");
		listem.add("Bolu");
		listem.stream().limit(4).collect(Collectors.toList()).forEach(System.out::print);
		
		System.out.println("\n*************************************************************");
		// 2.örnek: sıralayarak ilk 2 veriyi getir
		List<String> listem2 = new ArrayList<String>();
		listem2.add("Malatya");
		listem2.add("İzmir");
		listem2.add("Ankara");
		listem2.add("Bolu");
		listem2.stream().limit(2).sorted().collect(Collectors.toList()).forEach(System.out::print);
		
		System.out.println("\n*************************************************************");
		// 2.örnek: sıralayarak ilk 2 veriyi getir
		List<String> listem3 = new ArrayList<String>();
		listem3.add("Malatya");
		listem3.add("İzmir");
		listem3.add("Ankara");
		listem3.add("Bolu");
		listem3.stream().sorted().limit(2).collect(Collectors.toList()).forEach(System.out::print);
		
	}
}
