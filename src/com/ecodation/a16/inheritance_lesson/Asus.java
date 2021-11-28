package com.ecodation.a16.inheritance_lesson;

public class Asus extends InheritanceClass {
	// seri sürüm kimlik numarası
	private static final long serialVersionUID = 1910736235572526758L;
	
	private String asusColor;
	
	// parametresiz constructor
	public Asus() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	public Asus(String computerName, double computerPrice, String asusColor) {
		super(computerName, computerPrice);
		this.asusColor = asusColor;
	}
	
	// toString
	@Override
	public String toString() {
		return "Asus [asusColor=" + asusColor + ", getComputerName()=" + getComputerName() + ", getComputerPrice()="
				+ getComputerPrice() + "]";
	}
	
	// getter and setter
	public String getAsusColor() {
		return asusColor;
	}
	
	public void setAsusColor(String asusColor) {
		this.asusColor = asusColor;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
