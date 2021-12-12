package com.ecodation.a25.oopexam;

public class Adel extends CommonProperty implements ICommonMethod {
	private static final long serialVersionUID = -7316269419043622537L;
	
	private String spiralTip;
	
	public Adel() {
		// TODO Auto-generated constructor stub
	}
	
	public Adel(long pencilId, String pencilColor, String pencilPrice, String spiralTip) {
		super(pencilId, pencilColor, pencilPrice);
		this.spiralTip = spiralTip;
	}
	
	@Override
	public String toString() {
		return "Adel [spiralTip=" + spiralTip + ", pencilId=" + pencilId + ", pencilColor=" + pencilColor
				+ ", pencilPrice=" + pencilPrice + "]";
	}
	
	public String getSpiralTip() {
		return spiralTip;
	}
	
	public void setSpiralTip(String spiralTip) {
		this.spiralTip = spiralTip;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public void pencilPro() {
		System.out.println("Adel pro 54545");
		
	}
	
	@Override
	public void pencilTrace() {
		System.out.println("Adel trace asd845554");
		
	}
	
}
