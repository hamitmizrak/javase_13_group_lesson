package com.ecodation.a29.aslist;

import java.io.Serializable;

public class Computer implements Serializable {
	private static final long serialVersionUID = -6289108484418866826L;
	
	// object variable
	private int computerId = 0;
	private String computerName = "";
	private String computerPrice = "";
	
	// parametresiz constructor
	public Computer() {
		
	}
	
	// parametreli constructor
	public Computer(int computerId, String computerName, String computerPrice) {
		this.computerId = computerId;
		this.computerName = computerName;
		this.computerPrice = computerPrice;
	}
	
	// static
	static {
		
	}
	
	// toString
	@Override
	public String toString() {
		return "Computer [computerId=" + computerId + ", computerName=" + computerName + ", computerPrice="
				+ computerPrice + "]";
	}
	
	// getter and setter
	public int getComputerId() {
		return computerId;
	}
	
	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}
	
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	public String getComputerPrice() {
		return computerPrice;
	}
	
	public void setComputerPrice(String computerPrice) {
		this.computerPrice = computerPrice;
	}
	
}
