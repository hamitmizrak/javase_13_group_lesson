package com.ecodation.a28.generics.collection;

public class PersonAvg {
	/*
	 * Person adi,soyadi,yas,maas
	 */
	// psvm 5 tane instance maaş
	// maaşların ortalasını alalım
	// kişilerle karşılaştırma yapalım ortalamanın altında olanlar 3000 eklesin
	
	private String adi;
	private String soyadi;
	private int yas;
	private double maas;
	
	public PersonAvg() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonAvg(String adi, String soyadi, int yas, double maas) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
		this.yas = yas;
		this.maas = maas;
	}
	
	@Override
	public String toString() {
		return "PersonAvg [adi=" + adi + ", soyadi=" + soyadi + ", yas=" + yas + ", maas=" + maas + "]";
	}
	
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public String getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	public int getYas() {
		return yas;
	}
	
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public double getMaas() {
		return maas;
	}
	
	public void setMaas(double maas) {
		this.maas = maas;
	}
	
}