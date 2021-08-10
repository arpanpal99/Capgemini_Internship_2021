package com.capgemini.practice.Day15.multiThreading;


public class NumberThread implements Runnable{

	String tname;
	Thread t,t1;
	
	public NumberThread(String threadName) {
		System.out.println("In constructor");
		tname=threadName;
		t=new Thread(this,threadName);
		t.start();
		t1=new Thread();
		t1.setName("Rama");
		t1.setPriority(6);
		t1.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(tname);
		System.out.println("name = "+t.getName());
		System.out.println("reading the priority of the thread = "+t.getPriority());
		System.out.println("name = "+t1.getName());
		System.out.println("reading the priority of the thread = "+t1.getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
	}
	
	public static void main(String[] args) {
		NumberThread nt = new NumberThread("Krishna");
		System.out.println("in main method");
	}
}
