package com.ecodation.a30.design_pattern;

public class SingletonDesignPattern {
	
	private static SingletonDesignPattern instance;
	
	// constructor:private olması bu classtan instance yapılmasın diyedir.
	private SingletonDesignPattern() {
	}
	
	// dış dünyaya açılan kapıdır
	public static SingletonDesignPattern getInstance() {
		
		// sadece tane SingletonDesignPattern classını kullandım.
		// eğer önceden SingletonDesignPattern oluşturulmuş ise var olanı kullan
		// yoksa 1 tane oluştur
		if (instance == null) {
			instance = new SingletonDesignPattern();
		}
		return instance;
	}
	
}
