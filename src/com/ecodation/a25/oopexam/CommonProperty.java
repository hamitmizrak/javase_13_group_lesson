package com.ecodation.a25.oopexam;

import java.io.Serializable;

abstract public class CommonProperty implements Serializable {
	private static final long serialVersionUID = 5544084703403585333L;
	
	protected long pencilId;
	protected String pencilColor;
	protected String pencilPrice;
	
	public CommonProperty() {
		// TODO Auto-generated constructor stub
	}
	
	public CommonProperty(long pencilId, String pencilColor, String pencilPrice) {
		super();
		this.pencilId = pencilId;
		this.pencilColor = pencilColor;
		this.pencilPrice = pencilPrice;
	}
	
	public long getPencilId() {
		return pencilId;
	}
	
	public void setPencilId(long pencilId) {
		this.pencilId = pencilId;
	}
	
	public String getPencilColor() {
		return pencilColor;
	}
	
	public void setPencilColor(String pencilColor) {
		this.pencilColor = pencilColor;
	}
	
	public String getPencilPrice() {
		return pencilPrice;
	}
	
	public void setPencilPrice(String pencilPrice) {
		this.pencilPrice = pencilPrice;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
