package com.ecodation.a2.variables;

public class _07_Variable_var {
	public static void main(String[] args) {
		// var: java 10 gelmiştir bütün değişken yapıları kendi içinde barındırır
		// ancak var kullanmak performansımızı azaltır, non-typesafe özelliği vardır.
		var sayi55 = true;
		System.out.println(sayi55);
		
		Object o1 = true;
		System.out.println(o1);
		
		// sıfır :peçeten biterse
		// null :hiç peçete üretmemişsen
		// new :peçete fabrika üretirsen
	}
}
