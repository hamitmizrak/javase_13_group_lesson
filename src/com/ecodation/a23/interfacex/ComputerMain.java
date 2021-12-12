package com.ecodation.a23.interfacex;

public class ComputerMain {
	
	public static void main(String[] args) {
		
		Msi msi = new Msi(12, "cpu msi 85", "12GB", "5.0");
		System.out.println(msi);
		msi.companyName();
		msi.companySEO();
		msi.companyTrade();
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		Monster monster = new Monster(1515, "monster cpu 85", "monster ram 45", "6.0");
		System.out.println(monster);
		monster.companyName();
		monster.companySEO();
		monster.companyTrade();
		
	}
	
}
