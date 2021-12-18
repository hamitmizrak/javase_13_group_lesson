package com.ecodation.a28.generics.collection;

import java.util.Arrays;
import java.util.List;

// psvm 5 tane instance maaş
// maaşların ortalasını alalım
// kişilerle karşılaştırma yapalım ortalamanın altında olanlar 3000 eklesin
public class PersonAvgMainTest {
	
	public static void main(String[] args) {
		PersonAvg avg1 = new PersonAvg("Ahmet-1", "Kerim-1", 28, 3000);
		PersonAvg avg2 = new PersonAvg("Ahmet-2", "Kerim-2", 29, 4000);
		PersonAvg avg3 = new PersonAvg("Ahmet-3", "Kerim-3", 35, 8000);
		PersonAvg avg4 = new PersonAvg("Ahmet-4", "Kerim-4", 41, 7000);
		PersonAvg avg5 = new PersonAvg("Ahmet-5", "Kerim-4", 38, 9000);
		
		List<PersonAvg> listem = Arrays.asList(avg1, avg2, avg3, avg4, avg5);
		System.out.println(listem.size());
		
		// double ortalamaMaas = (avg1.getMaas() + avg2.getMaas() + avg3.getMaas() +
		// avg4.getMaas() + avg5.getMaas()) / 5;
		// double ortalamaMaas = (avg1.getMaas() + avg2.getMaas() + avg3.getMaas() +
		// avg4.getMaas() + avg5.getMaas())
		// listem.size();
		// System.out.println(ortalamaMaas);
		
		double toplam = 0, ortalama = 0;
		
		for (PersonAvg avg : listem) {
			// System.out.println(avg);
			toplam = toplam + avg.getMaas();
		}
		System.out.println("**************************************************");
		ortalama = toplam / listem.size();
		System.out.println("toplam para:" + toplam + " ortalaması: " + ortalama);
		
		for (PersonAvg avg : listem) {
			if (ortalama > avg.getMaas()) {
				System.out.println(avg);
				avg.setMaas(avg.getMaas() + 3000);
			}
			System.out.println(avg);
		}
		
	}
	
}
