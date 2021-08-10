package com.cg.lab6_Collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class L6F_EligibleVoters {

	public static List<Integer> votersList(Map<Integer,Integer> hMap) {
		
		List<Integer> vList=new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> m : hMap.entrySet()) if(m.getValue() >= 18) vList.add(m.getKey());
		return vList;
	}
	
	public static void main(String[] args) {

		Map<Integer,Integer> hMap = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		int i, n, id, age;
		System.out.print("Enter how many people wants to register: "); 	n = sc.nextInt();

		for(i = 0; i < n; i++) {
			System.out.print("\nEnter ID of person " + (i+1)  + " : ");	id=sc.nextInt();
			System.out.print("Enter age of person " + (i+1) + ": ");	age=sc.nextInt();
			hMap.put(id, age);
		}
		System.out.print("\nID's of eligible persons: " + votersList(hMap));
		sc.close();
	}

}
