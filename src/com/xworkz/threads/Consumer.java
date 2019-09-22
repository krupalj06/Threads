package com.xworkz.threads;

public class Consumer extends Thread{
	
	Data data;
	int length;
	
	public Consumer(Data data, int length) {
		this.data = data;
		this.length = length;
	}

	@Override
	public void run() {
		for(int i=0;i<length;i++) {
			int value = data.get();
			System.out.println("Consumer: "+Thread.currentThread().getName()
					+" consumes value: "+value);
		}
	}
}
