package com.ecodation.a6.loop;

public class BreakReturnContinue {
	public static void main(String[] args) {
		
		// break: kırmak (döngüyü kırıyor)
		// return: geri dönsün (metotlarda kırıyor)
		// continue: devam etsin
		
		// eğer bu sayılardan 23 ve sonrasını gösterme
		for (int i = 1; i <= 250; i++) {
			
			// sayılardan 23 üstündekileri alma
			if (i > 23) {
				break;
			}
			
			// 5 bölünebilen sayıları es geçsin yani ekranda göstermesin
			if (i % 5 == 0) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		
	}
}
