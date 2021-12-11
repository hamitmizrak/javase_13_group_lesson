package com.ecodation.a21.terimler;

import java.util.Date;

public class SenkronAsenkron {
	// senkron:bir işimizi sırayla yapılmasıdır.
	// asenkron:biribirini beklemeden bağımsız olarak işlemlerimizi
	// gerçekleştiriyoruz.(aynı anda bireden fazla işler yapmaya)
	
	public static void main(String[] args) {
		// midnight, January 1, 1970 UTC.
		long zaman = System.currentTimeMillis();
		System.out.println(zaman);
		
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date);
	}
}
