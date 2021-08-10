package com.capgemini.practice.Day16.predicate_in_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInStudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> stdList = new ArrayList<Student>();
		stdList.add(new Student(123,"Rama"));
		stdList.add(new Student(124,"Ramji"));
		stdList.add(new Student(125,"Krishna"));
		
		Function<Student,String> funcStdToString=(Student s)->{return s.getStudentName();};
		Function<String,String> subStr=(String s)->s.substring(0,1);
		List<String> studentNameInitials = convertStudentNameListToNamesList(stdList,funcStdToString.andThen(subStr));
		
		System.out.println("Student Name Initials = ");
		//for each method in java 8
		studentNameInitials.forEach(str->{System.out.print(" "+str);});
	}//main close
	
	public static List<String> convertStudentNameListToNamesList(List<Student> stdList, Function<Student,String> subStr){
		List<String> studentNameList = new ArrayList<String>();
		for(Student s : stdList) {
			studentNameList.add(subStr.apply(s));
		}
		return studentNameList;
	}

}