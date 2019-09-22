package com.xworkz.threads;

public class MultipleOf10 extends Thread {
	MultiplesOfNum mon;

	public MultipleOf10(MultiplesOfNum mon) {
		super();
		this.mon = mon;
	}
	
	@Override
	public void run() {
		mon.printMultiples(100);
	}

}
