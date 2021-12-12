package com.ecodation.a23.interfacex;

public class Msi extends CommonProperty implements ICommonMethod {
	private static final long serialVersionUID = -2661767823222606697L;
	
	private String camera5D;
	
	// parametresiz constructor
	public Msi() {
		this.camera5D = "xlk521ws";
	}
	
	// parametreli constructor
	public Msi(long serialId, String cpu, String ram, String camera5d) {
		super(serialId, cpu, ram);
		this.camera5D = camera5d;
	}
	
	// classını kimlik numarası gibidir.
	@Override
	public String toString() {
		return "Msi [camera5D=" + camera5D + ", serialId=" + serialId + ", cpu=" + cpu + ", ram=" + ram + "]";
	}
	
	// Getter and setter
	public String getCamera5D() {
		return camera5D;
	}
	
	public void setCamera5D(String camera5d) {
		camera5D = camera5d;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	// interface metotlar
	@Override
	public void companyName() {
		System.out.println("Msi");
		
	}
	
	@Override
	public void companyTrade() {
		System.out.println("Msi Trade 74xc");
		
	}
	
	@Override
	public void companySEO() {
		System.out.println("Msi Ceo xyz.");
		
	}
	
}
