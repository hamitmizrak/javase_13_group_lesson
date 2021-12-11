package com.ecodation.a22.multithreadx;

public class ThreadImplements implements Runnable {
	
	@Override
	public void run() {
		
		for (int i = 1; i <= 10; i++) {
			// 1 saniye=1000ms
			try {
				
				Thread.sleep(1000);
				System.out.print(i + " ");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadImplements());
		thread.start();
	}
	
}
