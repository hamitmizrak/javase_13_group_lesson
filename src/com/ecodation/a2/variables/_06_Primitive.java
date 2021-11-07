package com.ecodation.a2.variables;

public class _06_Primitive {
	public static void main(String[] args) {
		// Primitive: türler kaç tanedir sayınız:8 tane ilkel(primitve) tür vardır.
		// primitive: ilkel türlerdir. Vampirdir.
		
		// primitive türler: Wrapper Classlarından beslenirler(vampir)
		// primitive türler null alamazlar
		// primitive instance olmaz
		// primitive türden dolayı java 100% oop değildir.
		// primitive: stack hafızayı kullanırlar
		// primitive: stack hafıza Heap hafızaya göre daha hızlıdır.
		// primitive : kullanmamızdaki amaçımız hızlı değişkenler kullanmaktır.
		// primitive: serileştirme yapamıyoruz.
		// ilk değer vermek zorunda değiliz. örneğin; int sayi;
		
		// 1 byte=8 bit
		// 1 bit= 0
		// 1 bit= 1
		// 00001110=8 bit = 1byte
		
		// tamsayı
		byte b1;
		// default: 0
		// 1 byte=8 bit-1 ==> -2^7<=X<=+2^7 =-128 <=X<+127
		byte b2 = +111;
		
		short s1;
		// default: 0
		// short: 2 byte=16 bit-1 ==> -2^15<=X<=+2^15
		
		int i1;
		// default: 0
		// int: 4 byte=32 bit-1=31 ==> -2^31<=X<=+2^31
		
		long l1 = 4L;
		// default: 0L
		// long: 8 byte=64 bit
		
		// virgüllü sayı
		float f2 = 5.8f;
		// default: 0.0
		
		double d2 = 55.99;
		// default: 0.0
		
		// boolean
		boolean b3 = true;
		// default: false
		
		// char
		char c5 = '5';
		// default: '\u0000'
	}
}
