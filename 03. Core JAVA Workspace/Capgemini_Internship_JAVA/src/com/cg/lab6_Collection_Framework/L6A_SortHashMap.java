package com.cg.lab6_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class L6A_SortHashMap {

	 public static List<Map.Entry<String, Integer>> getValue(HashMap<String, Integer> languageMap) {
	    
//		 Sort in ascending order
		 List<Map.Entry<String, Integer>> returnList = new ArrayList <Map.Entry<String, Integer>> (languageMap.entrySet());
	     Collections.sort(returnList, new Comparator<Map.Entry<String, Integer> >() {
	         public int compare(Map.Entry<String, Integer> val1, Map.Entry<String, Integer> val2) {
	             return -(val2.getValue()).compareTo(val1.getValue());
	         }
	     });
	     
//	     Sort in descending order
//		  Collections.sort(returnList, new Comparator<Map.Entry<String, Integer> >() {
//			  public int compare(Map.Entry<String, Integer> val1, Map.Entry<String, Integer> val2) { 
//				  return (val2.getValue()).compareTo(val1.getValue()); 
//			  } 
//		  });
			 
		return returnList;
	 }

	 
	 public static void main(String[] args)
	 {
		 // Creating HashMap
	     HashMap<String, Integer> languageMap = new HashMap<String, Integer>();

	     // Adding entries
	     languageMap.put("Cloud Architecture", 98);
	     languageMap.put("Cyber Security", 85);
	     languageMap.put("DBMS", 91);
	     languageMap.put("Java", 95);
	     languageMap.put("Operating System", 79);
	     languageMap.put("Networking", 80);
	     
	     // Sorting the HashMap and Obtaining a Sorted List
	     List<Map.Entry<String, Integer>> sortedList = getValue(languageMap);

	     // Printing the sorted List
	     for(Entry<String, Integer> mp : sortedList) System.out.println(mp.getValue() + " - " + mp.getKey());
	     
	 }
	}