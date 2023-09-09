package practice.javaprograms1;

import java.util.Arrays;

public class ForEachArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] ar = { 10, 99,50, 60, 80, 90 };
		Arrays.sort(ar); 

		 
		 for (int i : ar) {
			System.out.println(i);
		}
	}

}

