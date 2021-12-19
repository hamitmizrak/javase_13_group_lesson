package com.ecodation.a00.examples;

import java.util.Scanner;

/**
 * 1-) adım
 * kullanıcı tarafında (Scanner)
 * döngünün başlangıcını bitişini kullanaıcadan alacağım
 * 
 * 1 100 validation lütfen başlangıçı küçük giriniz bitişi büyük bizi uyarsın
 * 1 50
 * ilk sayı son sayı toplayalaım
 * 
 * vermiş olduğunuz aralıktaki değerleri toplasın.
 * 
 * ipucu: döngü kullanmak
 * trycatch
 * Excepiton oluşturup hata mesajını throw new HamitMizrakExcepiton("lütfen
 * başlangıçı küçük giriniz bitişi büyük bizi uyarsın")
 * 
 * int toplam=0;
 * 
 * 2-adım
 * tek sayı adedi
 * tek sayı toplamları
 * çift sayı adedi
 * çift sayı adeti
 */
// ödev: kullanıcıdan aldığımız bir sayının asal olup olmadığını bulan algoritma

// ödev: kullanıcıdan aldığımız bir sayının faktöriyeli hesplayan algoritma

// ödev:vize final kullanıcı tarafından alınan vize notunun%40 final notunun%60
// ve
// ortalama: eğer 50 altında ise : kaldı, 60 ise CC 80:BA ve üstü AA ancak
// notlar
// negatif girilemez ve ortlama en fazla 0<=ortalama<=100 olmalı
public class _a02_Dongu {
	
	public static void main(String[] args) throws EcodationExcepiton {
		Scanner klavye = new Scanner(System.in);
		int start, finish, sum, counterSum = 0, oddCounter = 0, oddSum = 0, evenCounter = 0, evenSum = 0;
		
		System.out.println("lütfen döngü başlangını yazınız");
		start = klavye.nextInt();
		klavye.nextLine();
		
		System.out.println("lütfen döngü bitişi yazınız");
		finish = klavye.nextInt();
		
		if (start < finish) {
			try {
				sum = start + finish;
				for (int i = start; i <= finish; i++) {
					counterSum = counterSum + i;
					
					// çift sayı
					if (i % 2 == 0) {
						evenSum += i;
						evenCounter++;
					} else {
						oddSum += i;
						oddCounter++;
					}
					
				}
				System.out.println("ilk sayı: " + start + " son sayı: " + finish + " toplamları: " + sum);
				System.out.println("Sayı toplamları: " + counterSum);
				
				System.out.println("tek sayı : " + oddCounter + " tanedir");
				System.out.println("tek sayı toplamları: " + oddSum);
				
				System.out.println("çift sayı : " + evenCounter + " tanedir");
				System.out.println("çift sayı toplamları: " + evenSum);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			throw new EcodationExcepiton("Lütfen başlangıçı küçük giriniz bitişi büyük bizi giriniz");
		}
		
	}
	// 1 2 3 4 5 6
	// 1+6=7
	// toplamalrı:21
	// tek sayı adeti:3
	// tek sayı toplamalrı:9
	
	// çift sayı adeti:3
	// çift sayı toplamalrı:12
	
}
