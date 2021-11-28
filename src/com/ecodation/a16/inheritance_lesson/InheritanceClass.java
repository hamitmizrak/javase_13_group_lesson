package com.ecodation.a16.inheritance_lesson;

import java.io.Serializable;

public class InheritanceClass implements Serializable {
	// her class kendine ait benzersiz bir ID olması gerekir.
	private static final long serialVersionUID = -1455808515347141560L;
	
	// nesne değişkenleri == global variable
	private String computerName;
	private double computerPrice;
	
	// parametresiz constructor:Kurucu metot
	public InheritanceClass() {
		// default değerler
		this.computerName = "computer adını girmediniz";
		this.computerPrice = 10;
	}
	
	// parametreli constructor:Kurucu metot overloading:aşırı yükleme
	public InheritanceClass(String computerName, double computerPrice) {// local variable
		this.computerName = computerName;
		this.computerPrice = computerPrice;
	}
	
	// Shift+Alt+s
	// toString: kimliktir.
	@Override
	public String toString() {
		return "InheritanceClass [computerName=" + computerName + ", computerPrice=" + computerPrice + "]";
	}
	
	// methods
	public void computerFullPropert() {
		System.out.println("bilgisayar adı" + getComputerName() + " bilgisayar fiyatı:" + getComputerPrice());
	}
	
	// getter and setter
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	public double getComputerPrice() {
		return computerPrice;
	}
	
	public void setComputerPrice(double computerPrice) {
		this.computerPrice = computerPrice;
	}
	
}
