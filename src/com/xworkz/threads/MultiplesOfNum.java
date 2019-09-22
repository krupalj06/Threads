package com.xworkz.threads;

public class MultiplesOfNum {
	Object o = new Object();
	public void printMultiples(int n) {
		
		//statement1
		//statement1
		//statement1
		System.out.println("Thread Info: "+Thread.currentThread().getName());
		synchronized (o) { //Syncronized block
			for(int i=1; i<=5; i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		//statement1
		//statement1
		//statement1
		//statement1
		System.out.println("Thread "+Thread.currentThread().getName()+" ends here");
	}

}
