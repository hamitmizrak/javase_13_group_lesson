package com.ecodation.a20.abstractx;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Atamiz atamiz1 = new Student();// polymorphism
		Atamiz atamiz2 = new Teacher();// polymorphism
		
		System.out.println("****************************************");
		
		Student student = new Student();
		student.govdesizMetot(); // polymorphism
		
		System.out.println("****************************************");
		
		Teacher teacher = new Teacher();
		teacher.govdesizMetot(); // polymorphism
	}
	
}
