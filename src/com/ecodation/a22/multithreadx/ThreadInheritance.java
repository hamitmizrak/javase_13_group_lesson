package com.ecodation.a22.multithreadx;

public class ThreadInheritance extends Thread {
	
	private String className;
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	// run metodumuz
	// Shift+Alt+s
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			// 1 saniye=1000ms
			try {
				
				System.out.print(this.className + i + "  ");
				// 1 saniye uyu sonra kalk
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadInheritance thread1 = new ThreadInheritance();
		thread1.setClassName("A");
		
		thread1.start();
	}
	
}
