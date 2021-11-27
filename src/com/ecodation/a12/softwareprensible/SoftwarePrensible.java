package com.ecodation.a12.softwareprensible;

import javax.swing.JOptionPane;

public class SoftwarePrensible {
	public static void sum(int number, int number2) {
		System.out.println(number + number2);
	}
	
	public static void count(int sayi) {
		System.out.println(sayi);
	}
	
	public static int userCount() {
		String jOp = JOptionPane.showInputDialog("lütfen sayı giriniz");
		return Integer.valueOf(jOp);// cast
	}
	
	public static void main(String[] args) {
		
		// KISS: Keep It Simple Stupid : her zaman için en basit yolda sorunu çöz
		
		// DRY: Dont Repeat Yourself: kendini tekrar etme yani metotlar yaz,classlar
		// yazın
		sum(4, 5);
		
		// YAGNI: kullanmayacağın kodu yazma
		// metot sadece mail atsın denildi.
		// aynı metot mail sms v.s
		
		// MONAD: bir metodun içinde başka metoduçağırmadır
		count(userCount());
		
		// RREP:Reuse Release Equivalence Prensible: projemizde paketler önemlidir.
		// paket common:
		// küçük harfler
		
		// CCP:Common Closure Prensible: ilgili paketinin içine ilgili classları ekleyin
	}
	
}
