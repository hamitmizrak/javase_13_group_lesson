package com.ecodation.a29.aslist;

import java.util.Arrays;
import java.util.List;

public class AsListMainTest {
	
	public static void main(String[] args) {
		
		Computer computer1 = new Computer(1, "Msi gl-1", "3000");
		Computer computer2 = new Computer(2, "Msi gl-2", "4000");
		Computer computer3 = new Computer(3, "Msi gl-3", "5000");
		
		// L-A-V
		// asList
		List<Computer> list = Arrays.asList(computer1, computer2, computer3);
		
		for (Computer temp : list) {
			temp.setComputerName(temp.getComputerName().concat("-ecodation"));
		}
		
		list.forEach(System.out::print);
	}
}
