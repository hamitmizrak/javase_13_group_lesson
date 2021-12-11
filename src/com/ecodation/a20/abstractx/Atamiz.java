package com.ecodation.a20.abstractx;
/*
 * abstaction=interface+abstact
 * .
 * abstract:soyut
 * instance oluşturulmasını istemediğimiz zaman
 * gövdeli ve gövdesiz metotlar yazmak için
 */

import java.io.Serializable;

abstract public class Atamiz implements Serializable {
	private static final long serialVersionUID = 317372886162080963L;
	
	private String boy;
	private String guzellikler;
	
	// gövdeli metot
	// { ==> curl brackets
	// - ==> Hypen
	public void govdeliMetot(double boy44, String guzellik44) {
		System.out.println("boyum:" + boy44 + " güzellikler:" + guzellik44);
	}
	
	abstract public void govdesizMetot();
	
	// getter and setter
	public String getBoy() {
		return boy;
	}
	
	public void setBoy(String boy) {
		this.boy = boy;
	}
	
	public String getGuzellikler() {
		return guzellikler;
	}
	
	public void setGuzellikler(String guzellikler) {
		this.guzellikler = guzellikler;
	}
	
}
