package com.ecodation.a23.interfacex;

public class Monster extends CommonProperty implements ICommonMethod {
	private static final long serialVersionUID = 7505794209691298097L;
	
	private String usb5;
	
	public Monster() {
		this.usb5 = "5.0";
	}
	
	public Monster(long serialId, String cpu, String ram, String usb5) {
		super(serialId, cpu, ram);
		this.usb5 = usb5;
	}
	
	@Override
	public String toString() {
		return "Monster [usb5=" + usb5 + ", serialId=" + serialId + ", cpu=" + cpu + ", ram=" + ram + "]";
	}
	
	public String getUsb5() {
		return usb5;
	}
	
	public void setUsb5(String usb5) {
		this.usb5 = usb5;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	// interface metotlar
	@Override
	public void companyName() {
		System.out.println("Monster");
		
	}
	
	@Override
	public void companyTrade() {
		System.out.println("Monster Trade Tdf74xc");
		
	}
	
	@Override
	public void companySEO() {
		System.out.println("Monster Ceo 7812jkl.");
		
	}
	
}
