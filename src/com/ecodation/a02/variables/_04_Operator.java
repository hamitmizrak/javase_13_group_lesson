package com.ecodation.a02.variables;

public class _04_Operator {
	public static void main(String[] args) {
		// değişkenler
		int number1 = 18;
		int number2 = 2;
		int result;
		
		// aritmetik operatörler
		// +=toplama -=cıkarma *=çarpma /=bölme %=kalan
		result = number1 + number2;
		System.out.println("toplama:" + result);
		
		result = number1 - number2;
		System.out.println("çıkarma:" + result);
		
		result = number1 * number2;
		System.out.println("çarpma:" + result);
		
		result = number1 / number2;
		System.out.println("bölme:" + result);
		
		result = number1 % number2;
		System.out.println("bölümünden kalan:" + result);
		
		// ilişkisel operatörler
		// matematikte: = java: ==
		// 4>2 4>=4 4<2 4<=2 4==4
		
		// mantıksal operatörler
		// kelimesel: &&=ve ||=veya !=değil
		
		// atama operatörü
		int sayi = 5;
		
		// sayı değişkenimizi 1 artırmak anlamına geliyor.
		// aşağıdaki 3 yapıda birbirinin aynısıdır. hangisini kullanmak istiyorsak onu
		// yazalım
		sayi++;
		sayi = sayi + 1;
		sayi += sayi;
		
		System.out.println(sayi);
		
		// kaydırma operatörü
		// 0>>4 =sıfır sağ tarafa doğru 4 adım ötele
		// 0<<4 =sıfır sol tarafa doğru 4 adım ötele
		// 00000000001 1>>4
		// 0010000000 1<<4
	}
}
