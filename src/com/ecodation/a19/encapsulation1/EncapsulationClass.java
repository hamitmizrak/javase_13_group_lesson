package com.ecodation.a19.encapsulation1;

public class EncapsulationClass {
	// public: her yerden erişim mümkündür.
	// aynı pakette farklı paketlerde,aynmı class veya farklı erişim mümkündür.
	public String comert;
	
	// protected
	// sadece aynı paketin aynı classı veya farklı class
	protected String araf;
	
	// private:cimridir
	// sadece aynı pakettin aynı classında erişim mümkündür.
	private String cimri;
	
	// default:
	// aynı paketin gerek farklı classı gerek aynı classından erişim mümkündür
	String normal;
	
	// Shift+Alt+s
	// getter and setter
	public String getCimri() {
		return cimri;
	}
	
	public void setCimri(String cimri) {
		this.cimri = cimri;
	}
	
}
