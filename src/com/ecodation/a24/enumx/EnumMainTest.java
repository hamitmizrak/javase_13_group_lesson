package com.ecodation.a24.enumx;

public class EnumMainTest {
	
	public static void main(String[] args) {
		
		String kazak = ESabitOlcu.xlarge.toString();
		System.out.println(kazak);
		
		System.out.println("name :" + ESabitOlcu.xlarge.name());
		System.out.println("ordinal :" + ESabitOlcu.xlarge.ordinal()); // sıfırdan başlar
		
		System.out.println("******************************");
		for (ESabitOlcu temp : ESabitOlcu.values()) {
			System.out.println(temp);
		}
	}
	
}
