package com.capgemini.practice.Day16.predicate_in_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInStudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(new Student(123,"Rama"));
		stdList.add(new Student(124,"Ramji"));
		stdList.add(new Student(125,"Krishna"));
	
		List namesStartsWithR = filterByName(stdList,(Student s)->s.getStudentName().startsWith("R"));
	}
	
	private static List filterByName(List<Student> stdList,Predicate<Student> pred) {
		List<Student> resultList = new ArrayList<Student>();
		for(Student s : stdList) {
			if(pred.test(s)) {
				resultList.add(s);
			}
		}
		return resultList;
	}

}