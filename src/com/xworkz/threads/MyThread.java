package com.xworkz.threads;

public class MyThread {
	public static void main(String[] args) {
		
		System.out.println("Thread Id:"
			+Thread.currentThread().getId());
		
		ThreadEx ex = new ThreadEx();
		ex.start();
		
		ThreadEx ex1 = new ThreadEx();
		ex1.start();
	}
}
