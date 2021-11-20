package com.ecodation.a10.diziler;

public class SingleArray4_Examp {
	
	public static void main(String[] args) {
		// orijinal dizi sabit kalsın clone dizisi oluştur.
		
		// object: çağırmak biraz masraflıdır.
		String[] dizi = { "Java", "JSP", "Spring", "JSF", "E.L", "SpringMVC" };
		
		// clone dizi(array)
		// String[] dizi2 = new String[5];
		String[] dizi2 = new String[dizi.length];
		
		// iterative for
		for (int i = 0; i < dizi2.length; i++) {
			dizi2[i] = dizi[i];
		}
		
		// forEach
		for (Object temp : dizi2) {
			System.out.print(temp + " ");
		}
		
	}
	
}
