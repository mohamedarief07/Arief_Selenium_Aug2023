package assignment.week3.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		// Sort the array
		Arrays.sort(arr);
		
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=++i) {				
				System.out.println("Missing Element In An Array: " +i);
				break;
				
			}
		}
		

	}

}
