package com.capgemini.practice.Day05;
import java.util.StringJoiner;

public class StringJoinerExample {
			public static void main(String...args) {//java 8 main method signature
				StringJoiner joinWords = new StringJoiner(",","This "," Java 8");
				//adding values to String Joiner
			
				joinWords.add("is");
				joinWords.add("a");
				joinWords.add("String");
				joinWords.add("Joiner");
				joinWords.add("added");
				joinWords.add("in");
			
				
				System.out.println(joinWords);
				
				
				StringJoiner joinWords1 = new StringJoiner(",","This "," Java 8");
				//adding values to String Joiner
			
				joinWords.add("is");
				joinWords.add("a");
				joinWords.add("String");
				joinWords.add("Joiner");
				joinWords.add("added");
				joinWords.add("in");
				
				
				StringJoiner stringJoinerMerge = joinWords.merge(joinWords1);
				System.out.println(stringJoinerMerge);
				String str = stringJoinerMerge.toString();
				System.out.println(str.contains("is"));
						
			
			}
}
