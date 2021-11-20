package com.ecodation.a06.loop;

public class WhileDongusu {
	public static void main(String[] args) {
		// 12:15
		
		// for döngüsü: 3 şartı kesinlikle yazmak zorundayız başlangıç bitiş artırmak
		// indis
		for (int i = 1; i <= 1000; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n*****************");
		
		// while döngüsü:
		int i2 = 1;
		while (i2 <= 1000) {
			System.out.print(i2 + " ");
			i2++;
		}
		
		System.out.println("\n*****************");
		// do-while: program ne olursa olsun en az 1 kez çalışacak sonra şarta göre
		// devame edecek
		int i3 = 1;
		do {
			System.out.print(i3 + " ");
			i3++;
		} while (i3 <= 1000);
		
		System.out.println("\n*****************");
		// forEach: diziyle beraber kullanılır
		int[] dizi = { 2, 9, 6, 5, 8 };
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		
		// break-continue-return
		
		// Annotation ==> @
		
	}
}
