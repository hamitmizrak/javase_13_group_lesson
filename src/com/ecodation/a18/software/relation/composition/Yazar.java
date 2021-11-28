package com.ecodation.a18.software.relation.composition;

import java.util.List;

// 1
public class Yazar {
	// özellikler
	private String yazarAdi = ""; // nullPointerExcepition
	
	// parametresiz constructor
	public Yazar() {
		
	}
	
	// composition
	private List<Kitap> kitapListesi;
	
	// parametreli constructor
	public Yazar(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	
	// toString
	@Override
	public String toString() {
		return "Yazar [yazarAdi=" + yazarAdi + "]";
	}
	
	// getter and setter
	public String getYazarAdi() {
		return yazarAdi;
	}
	
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	
	public List<Kitap> getKitapListesi() {
		return kitapListesi;
	}
	
	public void setKitapListesi(List<Kitap> kitapListesi) {
		this.kitapListesi = kitapListesi;
	}
	
}
