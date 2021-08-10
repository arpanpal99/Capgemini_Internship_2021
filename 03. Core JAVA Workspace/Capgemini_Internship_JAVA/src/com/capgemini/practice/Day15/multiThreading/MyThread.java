package com.capgemini.practice.Day15.multiThreading;


public class MyThread implements Runnable{

	String name;
	Thread t;
	
	public MyThread(String threadname) {
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New Thread : "+t);
		System.out.println("================");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is in running state");

		try {
			for(int i=5;i>0;i--) {
				System.out.println(name+" : "+i);
				System.out.println("================");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(name+"...exiting...");
	}
}