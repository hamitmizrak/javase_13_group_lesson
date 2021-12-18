package com.ecodation.a27.generics;

/*
 * Generics bir class ismi Ecodation
 * 2 tane Generics Type
 * bunu constructar olacak
 * 2 tane metot 1 normal 2.generics olsun generic olanun 3 tane parametresi
 * olsun bu
 * parametrelerden 2 tane generics 1 tane String türünden olsun
 * sonra main classı oluşturalım
 * psvm ==> instance oluşturacağım(Ecodation)
 * dataset veri vereceğim sonra ekranda çıktısı alacağım
 */
public class GenericsTutorials<T> {
	
	// generics type
	private T adi;
	private T numarasi;
	
	// parametresiz constructor
	public GenericsTutorials() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	public GenericsTutorials(T adi, T numarasi) {
		this.adi = adi;
		this.numarasi = numarasi;
	}
	
	// toString
	@Override
	public String toString() {
		return "GenericsTutorials [adi=" + adi + ", numarasi=" + numarasi + "]";
	}
	
	// method
	public void normalMethod(String adi) {
		System.out.println("Ben bir normal metodum " + adi);
	}
	
	// generics method
	public <A> void genericsMethod(A adi) {
		System.out.println("Ben bir generics metodum " + adi);
	}
	
	// getter and setter
	public T getAdi() {
		return adi;
	}
	
	public void setAdi(T adi) {
		this.adi = adi;
	}
	
	public T getNumarasi() {
		return numarasi;
	}
	
	public void setNumarasi(T numarasi) {
		this.numarasi = numarasi;
	}
	
}
