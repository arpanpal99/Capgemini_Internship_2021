package com.cg.lab6_Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class L6B_CountCharacter {

	private static Map<Character, Integer> countChars(String str) {
		
		HashMap<Character, Integer> charMap  = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        
        // To store the character as HashMap Key and number of occurences as integer HashMap Values
        for (char c : charArray) {
            if (charMap.containsKey(c)) 	charMap.put(c, charMap.get(c) + 1);
            else 							charMap.put(c, 1);
        }
        
        return charMap;
 
	}

	
	public static void main(String[] args) {
        String str = "2001: A Space Odyssey";
        Map<Character, Integer> charMap = countChars(str);
        
        // Printing the occurences
        for (Map.Entry entry : charMap.entrySet()) 
            System.out.println("'" + entry.getKey() + "' is repeated " + entry.getValue() + " times");
	}
}
