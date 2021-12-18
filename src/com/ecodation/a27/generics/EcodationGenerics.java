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
public class EcodationGenerics<T> {
	
	private T adi;
	private T soyadi;
	
	public EcodationGenerics() {
		// TODO Auto-generated constructor stub
	}
	
	public EcodationGenerics(T adi, T soyadi) {
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	@Override
	public String toString() {
		return "EcodationGenerics [adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
	public void deneme(String adi, String soyadi, String numarasi) {
		System.out.println(adi + " " + soyadi + " " + numarasi);
	}
	
	public <K> void denemeGenerics(K adi, K soyadi, String numarasi) {
		System.out.println(adi + " " + soyadi + " " + numarasi);
	}
	
	public T getAdi() {
		return adi;
	}
	
	public void setAdi(T adi) {
		this.adi = adi;
	}
	
	public T getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(T soyadi) {
		this.soyadi = soyadi;
	}
	
}
