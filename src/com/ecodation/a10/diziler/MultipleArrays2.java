package com.ecodation.a10.diziler;

public class MultipleArrays2 {
	
	public static void main(String[] args) {
		// 2 boyutlu: oyunlarda iç içe gececek for döngülerinden,
		
		// 2:satır
		// 5:sutun
		// int[][] matrix = new int[2][5];
		
		// enson satır değeri: 2-1
		// en son sutun değeri:2-1
		int[][] matrix = { { 0, 1, 2, 5 }, { 3, 4, 5, 0 } };
		
		// iterative for
		// kaç boyutlu ise o kadar for döngüsü vardır
		// manuel for
		for (int i = 0; i < matrix.length; i++) {// satır
			for (int j = 0; j < matrix[i].length; j++) {// sutun
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("******************");
		
	}
	
}
