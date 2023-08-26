package CodeReview;

import java.util.Arrays;

public class Solution {
	
	public static boolean isAnagram(String input1, String input2) {
        // Remove spaces and convert to lowercase for accurate comparison
        input1 = input1.replaceAll(" ", "").toLowerCase();
        input2 = input2.replaceAll(" ", "").toLowerCase();
        
        // Check if the lengths are equal after removing spaces
        if (input1.length() != input2.length()) {
            return false;
        }
        
        // Convert strings to char arrays and sort them
        char[] charArray1 = input1.toCharArray();
        char[] charArray2 = input2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen"; // Replace with your first input string
        String str2 = "silent"; // Replace with your second input string
        
        boolean result = isAnagram(str1, str2);
        
        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}


