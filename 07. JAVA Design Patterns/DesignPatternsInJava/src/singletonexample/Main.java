package singletonexample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTonExample ste = SingleTonExample.getInstance();
		SingleTonExample ste1 = SingleTonExample.getInstance();
		SingleTonExample ste2 = SingleTonExample.getInstance();
		ste.s = (ste.s).toUpperCase();
		System.out.println("String values using ste = " + ste.s);
		System.out.println("String values using ste1 = " + ste1.s);
		System.out.println("String values using ste1 = " + ste2.s);
	}

}
