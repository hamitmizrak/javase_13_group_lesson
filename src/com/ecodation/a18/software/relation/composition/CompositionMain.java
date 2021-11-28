package com.ecodation.a18.software.relation.composition;

import java.util.ArrayList;

public class CompositionMain {
	public static void main(String[] args) {
		// Assosication
		Yazar yazar = new Yazar("Neşat Nuri Gültekin");
		Kitap kitap = new Kitap("Çalı kuşu", "15");
		System.out.println(yazar.getYazarAdi() + " " + kitap.getKitapAdi() + " " + kitap.getKitapFiati());
		System.out.println("*************************************");
		
		// Composition
		Yazar yazar2 = new Yazar("Anthony Robbins");
		yazar2.setKitapListesi(new ArrayList<Kitap>());// nullPointerException almamak için
		
		Kitap kitap2 = new Kitap("Sınırsız Güç", "25");
		kitap2.setYazar(yazar2);
		kitap2.getYazar().getKitapListesi().add(kitap2);
		
		System.out.println(yazar2);
		System.out.println(kitap2);
	}
}
