package com.ecodation.a22.multithreadx;

public class ThreadTuto {
	/*
	 * multi thread:
	 * 1-)kalıtım ile ==> extends
	 * 2-)interface ==> implements
	 * 3-)Anonymous ;Class => Runnable run=new Runnable({ @Override public void
	 * run(){} });
	 */
	public static void main(String[] args) throws InterruptedException {
		
		ThreadInheritance thread1 = new ThreadInheritance();
		thread1.setClassName("A");
		
		ThreadInheritance thread2 = new ThreadInheritance();
		thread2.setClassName("B");
		
		ThreadInheritance thread3 = new ThreadInheritance();
		thread3.setClassName("C");
		
		// wait: 2.bir emre kadar çalışma
		thread1.wait();
		thread1.notify();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		//// PRIORITY hangisi daha önce olması gerekiyor
		// thread3.setPriority(Thread.MIN_PRIORITY);
		// thread2.setPriority(Thread.NORM_PRIORITY);
		// thread1.setPriority(Thread.MAX_PRIORITY);
		
		// // join: öncelikle thread1 bitsin sonrasında diğerleri bitsin
		// thread1.join();
		// thread3.join();
		
	}
}
