package com.xworkz.threads;

public class Data {
	private int data;
	private boolean available = false;
	
	public synchronized int get() {
		while(available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		available = false;
		notifyAll();
		return data;
	}
	
	public synchronized void set(int value) {
		while(available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = value;
		available = true;
		notifyAll();
	}
}
