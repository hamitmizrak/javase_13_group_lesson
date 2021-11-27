package com.ecodation.a15.oop;

import java.io.Serializable;

// MVC ==> Model yani bean yapıdır.
// bean: çekirdek :üst düzey bean
// seriazable:serileştirme: veri bütünlüğünü sağlamak için kullanıyoruz.
// this
// static:durağan demektir. new oluşturmadan ClassAdi.ozellikler
// final
// parametresiz constructor
// parametreli constructor
// toString()
final public class _2SupBeanTuto2 implements Serializable {
	private static final long serialVersionUID = -4974549832222983664L;
	
	// nesne özellikleri(global değişken)
	private String kalemRengi;
	private double kalemFiyati;
	
	// parametresiz constructor
	// constructor:
	/*
	 * return olmaz
	 * public ClassAdi(){}
	 * overloading yapabiliriz.
	 * default değerler vermek için kullanıyoruz,
	 * constructor public yerine private olursa instance yapamayız.
	 */
	// this:
	// 1-)global değişkelere erişmek için kullanılır
	// 2-)farklı costructor bileşenelere erişmek için kullanılır.
	public _2SupBeanTuto2() {
		this.kalemFiyati = 10;
		this.kalemRengi = "siyah";
		
		// farklı constructor çağır
		// this("1. constructor");
	}
	
	// parametreli constructor
	// metot adları aynı parametre sayıları farklı ise biz buna overloading
	public _2SupBeanTuto2(String kalemRengi, double kalemFiyati) {
		this.kalemRengi = kalemRengi;
		this.kalemFiyati = kalemFiyati;
	}
	
	// parametreli constructor
	public _2SupBeanTuto2(String kalemRengi) {
		this.kalemRengi = kalemRengi;
	}
	
	/*
	 * final:
	 * değişkenlerde kullanıyoruz
	 * final int sayi=5; bundan sonra sayi içeriğini değiştiremem
	 * classlarda final kullanırsak; o classı extends edemezsin
	 * metotlarda kullanırsak override edemem.
	 */
	
	// metotlarda kullanırsak override edemem.
	final public void deneme() {
	}
	
	public static void main(String[] args) {
		final int sayi = 5;
		String adi = StatikTuto.NOTE;
		System.out.println(adi);
		
	}
	
	// classın kimlik numarasıdır yani kişinin T:C kimlik numarasından büütn
	// bilgilerine erişim sağlamak
	@Override
	public String toString() {
		return "_2SupBeanTuto2 [kalemRengi=" + kalemRengi + ", kalemFiyati=" + kalemFiyati + "]";
	}
	
	// getter and setter
	
}
