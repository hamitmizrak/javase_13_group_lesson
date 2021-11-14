package com.ecodation.a3.string;

import java.util.StringTokenizer;

public class _13_StringTokenizer {
	
	public static void main(String[] args) {
		// java.lang kütüphanesinden çağırırız
		
		String kelime2 = "Java,JSP,JSF,Spring,SpringBoot&&SpringData";
		// 1.yöntem
		String[] dizi = kelime2.split(",");
		for (String temp : dizi) {
			System.out.println(temp);
		}
		
		System.out.println("*****************");
		
		// 2.yöntem
		// eğer büyük veriler varsa şunu kullanalım.
		StringTokenizer stringTokenizer = new StringTokenizer(kelime2, ",&&");
		while (stringTokenizer.hasMoreTokens()) {
			String stok = stringTokenizer.nextToken();
			System.out.println(stok);
		}
	}
	
}
