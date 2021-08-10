package com.cg.lab6_Collection_Framework;

import java.util.HashMap;
import java.util.Map.Entry;

public class L6D_StudentsAndMedals {

	private HashMap<String, String> getStudents (HashMap<String, Integer> studentMap) {
		
		HashMap<String,String> studentMedal = new HashMap<>();
        
        for(Entry<String, Integer> marks : studentMap.entrySet())
               if		(marks.getValue() >= 90)    studentMedal.put(marks.getKey(),"Gold");             
               else if	(marks.getValue() >= 80)  	studentMedal.put(marks.getKey(),"Silver");
               else if	(marks.getValue() >= 70)	studentMedal.put(marks.getKey(),"Bronze");
               
        return studentMedal;
	}
	
	public static void main(String[] args) {

		HashMap<String,Integer> studentMap = new HashMap<>();
		
		studentMap.put("Student1", 85);
		studentMap.put("Student2", 92);
		studentMap.put("Student3", 96);
		studentMap.put("Student4", 79);
		studentMap.put("Student5", 81);
		
        System.out.println(new L6D_StudentsAndMedals().getStudents(studentMap));

	}

}
