package com.ecodation.a18.software.relation.association;

public class AssociationMain {
	
	public static void main(String[] args) {
		
		Musteri musteri = new Musteri();
		musteri.setMusteriAdi("java");
		
		Banka banka = new Banka();
		banka.setBankaAdi("deneme bankası");
		
		System.out.println("müşteri adı: " + musteri.getMusteriAdi() + " banka adı: " + banka.getBankaAdi());
		
	}
	
}
