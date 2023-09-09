package assignment.week4.day1;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String text = "babu"; 
		char[] charArray = text.toCharArray();
		Set<Character> set=new HashSet<>();
		for (char charac : charArray) {
			 if (set.contains(charac)) {
				 set.remove(charac); // Remove if character is already in the set
	            } else {
	            	set.add(charac);    // Add character to the set if it's not already there
	            }
		}
		
		 for (char uniqueChar : set) {
	            System.out.print(uniqueChar + " ");
	        }
		

	}

}
