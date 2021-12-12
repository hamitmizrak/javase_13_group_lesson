package com.ecodation.a23.interfacex;

import java.io.Serializable;

abstract public class CommonProperty implements Serializable {
	private static final long serialVersionUID = 4434929002423016698L;
	
	// nesne değişkenlerimi
	protected long serialId;
	protected String cpu;
	protected String ram;
	
	// parametresiz constructor
	public CommonProperty() {
		this.serialId = 0;
		this.cpu = "cpu bilgilerini girmediniz";
		this.ram = "ram bilgilerini girmediniz";
	}
	
	// parametreli constructor
	public CommonProperty(long serialId, String cpu, String ram) {
		this.serialId = serialId;
		this.cpu = cpu;
		this.ram = ram;
	}
	
	// getter and setter
	public long getSerialId() {
		return serialId;
	}
	
	public void setSerialId(long serialId) {
		this.serialId = serialId;
	}
	
	public String getCpu() {
		return cpu;
	}
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
