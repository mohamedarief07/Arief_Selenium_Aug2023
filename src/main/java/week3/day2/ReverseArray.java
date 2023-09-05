package week3.day2;

import java.util.Arrays;

public class ReverseArray {
	
public static void main(String[] args) {
	
	int[] scores = { 98, 97, 76, 87, 90,1,23,34,56,67,32,12,43,56,21,34,5,34,23,32,34,354,34,3,545,64 };
	
	Arrays.sort(scores);
	
	for (int i = scores.length-1; i >=0 ; i--) {
		
		System.out.println(scores[i]);
		
	}
	
}
	
}