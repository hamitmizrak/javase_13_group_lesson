package com.ecodation.a03.string;

public class _12_StringBuilder {
	
	public static void main(String[] args) {
		// java.lang kütüphanesinden çağırırız
		String kelime = "merhabalar" + "nasılsın" + "iyi misin";
		System.out.println(kelime);
		
		String kelime2 = "merhabalar".concat("nasılsın").concat("iyi misin");
		System.out.println(kelime2);
		
		// eğer büyük veriler varsa şunu kullanalaım.
		StringBuilder builder = new StringBuilder();
		builder.append("merhabalar").append("nasılsın").append("iyi misin");
		String cevir = builder.toString();
		System.out.println(cevir);
	}
	
}
