package com.ecodation.optional;

import java.util.Optional;

public class _1_OptionalTutorials {
	public void deneme(String... adi) {
		System.out.println(adi[0]);
	}
	
	public void deneme2(String[] adi) {
		System.out.println(adi[0]);
	}
	
	public static void main(String[] args) {
		
		String deneme = "Merhabalar";
		
		Optional<String> emptyMi = Optional.empty();// Optional oluştur
		Optional<String> ofMi = Optional.of(deneme);// içi mutlaka dolu olmalı:
		Optional<String> ofNullMi = Optional.ofNullable(deneme);// iççi boş veya dolu olabilir.
		
		// Optional çağır ==> String ifaleri çağırmak için kullanıyoruz.
		System.out.println("get\t\t\t" + ofNullMi.get());
		
		// ifPresent: eğer içi dolu ise göster boşsa gösterme
		ofNullMi.ifPresent(System.out::println);
		
		// map: içeriklerde teker teker işlem yapmak için kullanıyoruz.
		System.out.println("map\t\t\t" + ofMi.map(String::toUpperCase).get());
		
		// orElse
		System.out.println("orElse\t\t\t" + emptyMi.orElse(deneme));
		
	}
}
