package com.capgemini.practice.Day05;
import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * String s = "A friend in need is a friend in deed"; //charAt is a method to
		 * pick a character in the given index char ch = s.charAt(6);
		 * System.out.println("Character at index 6 = " + ch); //if we want to extract a
		 * string frm a string String str = s.substring(8);
		 * System.out.println("Substring extracted from 8th index  = " + str);
		 * //extracting substring using start and end index String str1 =
		 * s.substring(8,16);
		 * System.out.println("Substring extracted from 8th index to 16th index  = " +
		 * str1); //extracting substring using start and end index using CharSequence
		 * interface CharSequence cs = s.subSequence(8, 16);
		 * System.out.println("CharSequence extracted = "+cs); //Lower case to upper
		 * case and vice versa System.out.println(s.toUpperCase());
		 * System.out.println(s.toLowerCase()); //convert string to charArray char
		 * strchars[] = s.toCharArray(); for(int i=0;i<strchars.length;i++) {
		 * System.out.println(strchars[i]); }
		 * 
		 * System.out.println("split string in to words"); String[] words =
		 * s.split(" "); for(int i=0;i<words.length;i++) { System.out.println(words[i]);
		 * }
		 */
		

		//System.out.println(s1.contains("ing"));
		//contains method checks whether string contains given string
		//startsWith and endsWith checks whether a string is starting with given string or ending with
		//given string respectively
		//System.out.println(s1.toLowerCase().endsWith("deed"));
		//System.out.println(s1.trim().startsWith("A"));
		/*
		 * String s2 = "A friend in need is a friend in deed";
		 * System.out.println("length of s1 before trim() method = "+s1.length());
		 * System.out.println("length of s1 after trim() method = "+s1.trim().length());
		 * System.out.println("Enter the character to read"); char ch1 =
		 * sc.next().trim().charAt(0); System.out.println("Entered character = " + ch1);
		 * 
		 * //to equate two strings System.out.println(s.equals(s1.trim())); //to compare
		 * two strings //String strOne = "java";
		 * 
		 * System.out.println("length of s1 = "+s1.length());
		 * System.out.println("length of s = "+s.length());
		 * System.out.println(s1.compareTo(s2));//difference of length
		 * System.out.println(s1.compareToIgnoreCase(s2));//it ignore cases
		 * 
		 * //index of a character String strTwo = "java";
		 * System.out.println(strTwo.lastIndexOf('a')); //str.contains(strTwo)
		 */		
		
		/*
		 * String s1 = "A friend in need is a friend in deed"; String s2 =
		 * "A friend in need is a friend in deed";
		 * //System.out.println(s1.codePointAt(0)); //it returns unicode value of the
		 * character at the specified index
		 * 
		 * System.out.println(s1.contentEquals(s2));//same as compareTo method //return
		 * type of compareTo is integer //return type of contentEquals is boolean
		 * 
		 * System.out.println(s1.codePointBefore(1)); //returns the unicode of character
		 * before the given index
		 * 
		 * System.out.println(s1.codePointCount(1,6)); //returns the no. of character
		 * between the given index
		 * 
		 * System.out.println(s1.indexOf('i', 10)); //searches the character from the
		 * given index
		 * 
		 * 
		 * String st = s1.replaceAll("i", "e"); System.out.println("after replace = "+
		 * st + "\t " + s1);
		 */
		
		//String join method vs contact method
		//both methods combines two string but
		//join can be used with delimiter
		//concat cannot be used with delimiter
		
		String s1 = "This is a string";
		String s2 = "in java";
		System.out.println(s1.concat(s2));
		System.out.println(String.join(",", s1,s2));
		
	}
}
