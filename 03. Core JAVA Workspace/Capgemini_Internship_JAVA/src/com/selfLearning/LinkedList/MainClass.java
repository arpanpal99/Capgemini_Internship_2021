package com.selfLearning.LinkedList;

import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();

		name.add("Call_me_Black");
		name.add("Alice");
		name.add("Tom");
		for (String x : name)
			System.out.println(x);
		System.out.println("Size of LinkedList = " + name.size() + "\n");

		name.addFirst("Jack Jill");
		for (String x : name)
			System.out.println(x);
		System.out.println("Size of LinkedList = " + name.size() + "\n");

		name.addLast("Indi Rossi");
		for (String x : name)
			System.out.println(x);
		System.out.println("Size of LinkedList = " + name.size() + "\n");

		name.remove(2);
		for (String x : name)
			System.out.println(x);
		System.out.println("Size of LinkedList = " + name.size() + "\n");

		name.removeLast();
		for (String x : name)
			System.out.println(x);
		System.out.println("Size of LinkedList = " + name.size() + "\n");

		name.removeFirst();
		for (String x : name)
			System.out.println(x);
		System.out.println("Size of LinkedList = " + name.size() + "\n");

		name.add(1, "That's me..!");
		;
		for (String x : name)
			System.out.println(x);
		System.out.println("Size of LinkedList = " + name.size() + "\n");

		name.set(2, "Tommy Vercetti");
		for (String x : name)
			System.out.println(x);
		System.out.println("Size of LinkedList = " + name.size() + "\n");

		name.clear();
		for (String x : name)
			System.out.println(x);
		System.out.println("Size of LinkedList = " + name.size() + "\n");

	}
}
