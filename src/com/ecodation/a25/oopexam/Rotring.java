package com.ecodation.a25.oopexam;

public class Rotring extends CommonProperty implements ICommonMethod {
	private static final long serialVersionUID = 7050334246223757973L;
	
	private String coalTip;
	
	public Rotring() {
		// TODO Auto-generated constructor stub
	}
	
	public Rotring(long pencilId, String pencilColor, String pencilPrice, String coalTip) {
		super(pencilId, pencilColor, pencilPrice);
		this.coalTip = coalTip;
	}
	
	@Override
	public String toString() {
		return "Rotring [coalTip=" + coalTip + ", pencilId=" + pencilId + ", pencilColor=" + pencilColor
				+ ", pencilPrice=" + pencilPrice + "]";
	}
	
	public String getCoalTip() {
		return coalTip;
	}
	
	public void setCoalTip(String coalTip) {
		this.coalTip = coalTip;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public void pencilPro() {
		System.out.println("Rotring pro 54545");
		
	}
	
	@Override
	public void pencilTrace() {
		System.out.println("Rotring trace asd845554");
		
	}
	
}
