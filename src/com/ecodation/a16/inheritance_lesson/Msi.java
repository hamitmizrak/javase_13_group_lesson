package com.ecodation.a16.inheritance_lesson;

// java 1 tane extends hakkkınız vardır:
// yani java Single Inheritance bir yapıya sahiptir
public class Msi extends InheritanceClass {
	private static final long serialVersionUID = -7039520137200623213L;
	
	// genel classtan farklı özellikler ekleyeceğim.
	private String msiNoice;
	
	public Msi() {
		
	}
	
	// Shift+Alt+s
	public Msi(String computerName, double computerPrice, String msiNoice) {
		// super ==> atamızın bilgileine erişmek için
		super(computerName, computerPrice);
		
		// global ==> değişkenlere erişmek için kullanırız
		this.msiNoice = msiNoice;
	}
	
	@Override
	public String toString() {
		return "Msi [msiNoice=" + msiNoice + ", getComputerName()=" + getComputerName() + ", getComputerPrice()="
				+ getComputerPrice() + "]";
	}
	// getter and setter
	
	public String getMsiNoice() {
		return msiNoice;
	}
	
	public void setMsiNoice(String msiNoice) {
		this.msiNoice = msiNoice;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
