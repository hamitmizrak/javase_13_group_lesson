package com.ecodation.a2.variables;

public class _09_WrapperClass {
	public static void main(String[] args) {
		// primitive türler
		// tamsayı
		byte b1;
		// b1 = null;
		short s1;
		int i1;
		long l1 = 4L;
		
		// virgüllü sayı
		float f2 = 5.8f;
		double d2 = 55.99;
		
		// boolean
		boolean b3 = true;
		
		// char
		char c5 = '5';
		
		// wrapper classlar(sarmal classlar)
		// null kulllanabilirsin, heap hafıza kullanırır , oop daha yakındır
		// mutlaka initial yani başlnagıç değer vermek zorundayız.
		// new ile oluşturmak zorundayız
		Byte b2 = new Byte((byte) 44);
		b2 = null;
		Short s2 = new Short((short) 44);
		Integer i2 = new Integer(44);
		Long l2 = new Long(44);
		
		Float f3 = new Float(5.8f);
		
		double d5; // primitive
		Double d3 = new Double(5.44); // wrapepr
		
		Character character = new Character('a');
		Boolean boolean1 = new Boolean(true);
	}
}
