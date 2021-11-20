package com.ecodation.a10.diziler;

import java.util.Random;

import javax.swing.JOptionPane;

public class DiziOrnegi {
	// Örnek
	// metot kullanıyoruz.
	// tek boyutlu dizi oluşturun
	// dizi eleman sayısını kullancııdan alalım
	// dizinin içeriğine rastgele sayılar atayalım
	// rastgele sayılar 1 -45 arasında olsun
	
	// dizideki ilk elemana erişelim
	// dizideki son elemana erişelim
	// dizideki elemanların toplamlarını bulalım
	// dizideki sayıların ortlaamasını bullalım
	
	public static void arrayCounter() {
		String userInformation = JOptionPane.showInputDialog("lütfen dizi eleman sayısını yazınız");
		int valueArray = Integer.valueOf(userInformation);
		int valueSum = 0, valueAvegerate = 0, valueEven, valueOdd;
		int[] dizi = new int[valueArray];
		
		Random random = new Random();
		
		for (int i = 0; i < dizi.length; i++) {
			int rastgele = random.nextInt(45) + 1;
			dizi[i] = rastgele;
		}
		
		// göstermek için
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		
		// toplmalarını
		for (int i = 0; i < dizi.length; i++) {
			valueSum += dizi[i];// toplama
			valueAvegerate = valueSum / dizi[dizi.length - 1];// ortalama
		}
		
		System.out.println("\ndizi ilk eleman: " + dizi[0]);
		System.out.println("dizi son eleman: " + dizi[dizi.length - 1]);
		System.out.println("ndizi toplamın: " + valueSum);
		System.out.println("ndizi ortalama: " + valueAvegerate);
		
	}
	
	public static void main(String[] args) {
		arrayCounter();
	}
	
	// Ödev-1
	// üsteki örneğindevamıdır dizideki tek çift sayıların toplamı ve sayısını
	// bulalım?
	
	// Not: aşağıdaki bütün örnekler yukardaki örnekten bağımsızdır.
	// Ödev-1
	// Kullanıcıdan alınan satır ve sutun ve içerik sembolü bilgisine göre satır ve
	// sutun oluşturalacak dizi kümesi yapalım
	
	// Ödev-2 şekil resimdeki
	
	// Ödev-3
	// Kullanıcıdan klavyeden Sıfır(0) sayısı girene kadar klavyeden girilecek
	// algoritma.
	// Sıfır girilene kadar bu sayılarında;
	// En küçüğü
	// En büyüğü
	// Toplamları
	// Ortalaması
	// Deneme sayısı
	// Eğer 5 sayısını girerse bunu dahil etmesin
	
}
