package com.ecodation.a31.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _ArrayToList {
	
	// asList: listeye çevirmek
	
	// Diziyi ==> Liste çevirmek
	public static List<int[]> arrayToList(int[] dizi) {
		List<Integer> listem = new ArrayList<Integer>();
		return Arrays.asList(dizi);
	}
	
	public static void main(String[] args) {
		int[] normalDizi = { 4, 5, 6, 9, 1 };
		arrayToList(normalDizi).stream().forEach(System.out::print);
		
	}
	
}
