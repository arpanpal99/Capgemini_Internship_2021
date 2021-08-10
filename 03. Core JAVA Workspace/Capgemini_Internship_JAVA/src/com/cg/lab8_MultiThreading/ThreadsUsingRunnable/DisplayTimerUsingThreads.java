package com.cg.lab8_MultiThreading.ThreadsUsingRunnable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayTimerUsingThreads implements Runnable {
	
	public synchronized void display() {
		System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
	}
	
	@Override
	public void run() {

		System.out.print("Present time : ");
		while(true) {
			try {
				display();
				Thread.sleep(10000);
				System.out.print("Time after 10 seconds : ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		DisplayTimerUsingThreads threadtimer = new DisplayTimerUsingThreads();
		new Thread(threadtimer).start();
	}
}