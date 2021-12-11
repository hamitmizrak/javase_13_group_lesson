package com.ecodation.a22.multithreadx;

public class LambdaThread {
	
	public static void main(String[] args) {
		// Anonymous olan thread için kullanıyoruxz Runnable
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println(i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		};
		
		runnable.run();
		
		// kısaltımış Thread
		Runnable runnable2 = () -> {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		runnable2.run();
	}
	
}
