package com.ecodation.a28.generics.collection;

import java.io.Serializable;

public class FilterStudent implements Serializable {
	private static final long serialVersionUID = 6521091787175543427L;
	private String adi;
	private int yas;
	
	public FilterStudent() {
		// TODO Auto-generated constructor stub
	}
	
	public FilterStudent(String adi, int yas) {
		this.adi = adi;
		this.yas = yas;
	}
	
	@Override
	public String toString() {
		return "FilterStudent [adi=" + adi + ", yas=" + yas + "]";
	}
	
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public int getYas() {
		return yas;
	}
	
	public void setYas(int yas) {
		this.yas = yas;
	}
	
}
