package com.ecodation.a31.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2_sorted {
	
	// stream: başlangıç
	// collect: bitiş
	public static void main(String[] args) {
		
		// 1.YOL
		List<String> listem = Arrays.asList("Malatya", "Ankara", "İzmir", "Bolu").stream().sorted()
				.collect(Collectors.toList());
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		System.out.println("\n*********************************");
		// 2.YOL
		Arrays.asList("Malatya", "Ankara", "İzmir", "Bolu").stream().sorted().collect(Collectors.toList())
				.forEach(System.out::print);
		
	}
}
