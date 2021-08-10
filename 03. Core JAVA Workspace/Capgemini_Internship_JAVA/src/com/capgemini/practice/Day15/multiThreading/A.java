package com.capgemini.practice.Day15.multiThreading;

public class A implements Runnable {

	int token = 1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (this) {
			Thread t = Thread.currentThread();
			String name = t.getName();
			System.out.println(token + ".....alloted to "+name);
			token++;
		}
		
	}
	
public static void main(String[] args) {
	A a1 = new A();
	Thread t1 =  new Thread(a1);
	Thread t3 =  new Thread(a1);
	Thread t2 =  new Thread(a1);
	Thread t4 =  new Thread(a1);
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}

}