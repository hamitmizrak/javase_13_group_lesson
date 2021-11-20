package com.ecodation.a05.condition;

import javax.swing.JOptionPane;

public class Examples {
	public static void main(String[] args) {
		String jOp = JOptionPane.showInputDialog("Lütfen sayı giriniz");
		
		// String'i integer çevirdim.
		int sayi = Integer.valueOf(jOp);
		
		switch (sayi) {
			case 1: {
				System.out.println("Sayı 1");
				break;
			}
			case 2: {
				System.out.println("Sayı 2");
				break;
			}
			case 3: {
				System.out.println("Sayı 3");
				break;
			}
			case 4: {
				System.out.println("Sayı 4");
				break;
			}
			case 5: {
				System.out.println("Sayı 5");
				break;
			}
			
			default:
				System.out.println("Sayı farklıdır");
				break;
		}
		
	}
}
