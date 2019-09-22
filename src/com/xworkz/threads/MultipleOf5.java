package com.xworkz.threads;

public class MultipleOf5 extends Thread {
	MultiplesOfNum mon;
	
	public MultipleOf5(MultiplesOfNum mon) {
		this.mon = mon;
	}

	@Override
	public void run() {
		mon.printMultiples(5);
	}
}
