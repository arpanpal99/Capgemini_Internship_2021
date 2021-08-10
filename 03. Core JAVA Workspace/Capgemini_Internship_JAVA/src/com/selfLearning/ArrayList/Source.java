package com.selfLearning.ArrayList;

import java.util.*;

class ArrayListOps  {

	public ArrayList<Integer> makeArrayListInt(int n) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) list.add(0);
		return list;
		
	}
	
	public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		
		ArrayList<Integer> revList = new ArrayList<Integer>();
		for(int i = list.size()-1; i >= 0; i--)	revList.add(list.get(i));
		return revList;
		
	}
	
	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n) {
		
		for(int i = 0; i < list.size(); i++) 
			if(list.get(i) == m)
				list.set(list.indexOf(m),n);
			
		return list;
		
	}
   
}
public class Source {
	
	public static void main(String[] args) {

	}
	
}