package com.ecodation.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class _2_OptionalTutorials2 {
	public static void main(String[] args) {
		
		List<String> listem = new ArrayList<String>();
		listem.add("Merhabalar");
		listem.add("Nasılsın");
		
		Optional<List<String>> emptyMi = Optional.empty();
		Optional<List<String>> ofMi = Optional.of(listem);
		Optional<List<String>> ofNullMi = Optional.ofNullable(listem);
		
		// Optional çağır
		System.out.println(ofNullMi.get());
		
		// ifPresent: eğer içi dolu ise göster boşsa gösterme
		ofNullMi.ifPresent(System.out::println);
		
		ofNullMi.isPresent();
	}
}
