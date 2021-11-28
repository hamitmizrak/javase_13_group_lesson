package com.ecodation.a18.software.relation.composition;

// N
public class Kitap {
	
	private String kitapAdi = ""; // nullPointerExcepition
	private String kitapFiati = ""; // nullPointerExcepition
	
	// parametresiz constructor
	public Kitap() {
		
	}
	
	// compositon
	private Yazar yazar;
	
	// parametreli constructor
	public Kitap(String kitapAdi, String kitapFiati) {
		this.kitapAdi = kitapAdi;
		this.kitapFiati = kitapFiati;
	}
	
	// toString
	@Override
	public String toString() {
		return "Kitap [kitapAdi=" + kitapAdi + ", kitapFiati=" + kitapFiati + ", yazar=" + yazar + "]";
	}
	
	// getter and setter
	public String getKitapAdi() {
		return kitapAdi;
	}
	
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	
	public String getKitapFiati() {
		return kitapFiati;
	}
	
	public void setKitapFiati(String kitapFiati) {
		this.kitapFiati = kitapFiati;
	}
	
	public Yazar getYazar() {
		return yazar;
	}
	
	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}
	
}
