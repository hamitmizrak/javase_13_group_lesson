package com.ecodation.examples.a00;

import javax.swing.JOptionPane;

public class _a01_NegatifMiPozitifMi {
	
	// JOptionPane 'den kullanıcıdan aldığın sayıyı
	// negatif mi pozitif mi olup olmadığını bulan algoritma
	
	// kullanıcıdan sıfır sayısı alınan kadar sürekli negatif mi pozitif mi olduğunu
	// hesaplasın
	// while(true) {}
	
	public static void main(String[] args) {
		while (true) {
			String sayi = JOptionPane.showInputDialog("lütfen bir sayı giriniz");
			int castSayisi = Integer.valueOf(sayi);
			
			if (castSayisi == 0) {
				System.out.println("programımız kapatılıyor....");
				// System.exit(0);
				break;
			} else {
				String result = (castSayisi < 0) ? "Sayı negatiftir." : "Sayı pozitiftir.";
				System.out.println(result);
			}
			
		}
		
	}
	
}
