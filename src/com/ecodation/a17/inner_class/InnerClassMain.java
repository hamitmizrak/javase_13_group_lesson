package com.ecodation.a17.inner_class;

public class InnerClassMain {
	
	public static void main(String[] args) {
		Ulke ulke = new Ulke();
		ulke.setUlkeAdi("Türkiye");
		
		Ulke.Sehir sehir = ulke.new Sehir();
		sehir.setSehirAdi("Ankara");
		
		Ulke.Sehir.PlakaNo plaka = sehir.new PlakaNo();
		plaka.setPlakaNumarasi("06");
		
		System.out.println("ülke: " + ulke.getUlkeAdi() + " Şehir: " + sehir.getSehirAdi() + " plaka numarası: "
				+ plaka.getPlakaNumarasi());
	}
	
}
