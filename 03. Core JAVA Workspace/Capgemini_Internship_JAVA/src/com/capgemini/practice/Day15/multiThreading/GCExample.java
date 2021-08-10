package com.capgemini.practice.Day15.multiThreading;

public class GCExample {

	public void finalize() {
		System.out.println("finalize method is called to make this object deleted by GC");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d=null;
		System.gc();
	}

}