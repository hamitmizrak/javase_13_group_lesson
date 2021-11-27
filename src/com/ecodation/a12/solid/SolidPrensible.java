package com.ecodation.a12.solid;

public class SolidPrensible {
	
	// s.o.l.i.d prensible : Robert C. Martin
	// S:Single Responsible prinsible :bir class yada bir metot sadece bir iş yapsın
	public void nonMultiple1() {
		System.out.println("sms send");
	}
	
	public void nonMultiple2() {
		System.out.println("mail send");
	}
	
	public void nonMultiple3() {
		System.out.println("posta send");
	}
	
	// O: Open closed: Bir sınıf yada metot var olan özelliği korusun ancak yeni
	// özelliğe adapte olsun.
	public static void openClosedMethod(int number) {
		Math.abs(number); // mutlak
		sqrtOpenClosed(number); // karekök
		
	}
	
	public static void sqrtOpenClosed(int number) {
		Math.sqrt(number); // karekökü
	}
	
	// L: Liskov substition prensible
	// kodlarımızda her hangi bir değişiklik yapmadan alt classları üst classlarının
	// yerine kullabilirsin.
	public void liskovMethod() {
		CommonProperty commonProperty = new CommonProperty();
		Student student = new Student();
		commonProperty = student;
		
	}
	
	// I:
	// Interface segregation prensible:bütün sorumluluğu bir tane interface yükleme
	// 1 tane interface birden fazla interface oluşturma
	interface deneme {
		interface deneme2 {
		}
		
		interface deneme3 {
		}
		
		interface deneme4 {
		}
	}
	
	// D:
	// Dependency Inversion prensible
	// classlar biribirine körü körüne bağlı olmasın
	/*
	 * kodlar sade olsun
	 * kod tekrar kullanmak
	 * clean code
	 * non-dependent
	 * sade
	 * esnek
	 */
	public static void main(String[] args) {
		
	}
	
}
