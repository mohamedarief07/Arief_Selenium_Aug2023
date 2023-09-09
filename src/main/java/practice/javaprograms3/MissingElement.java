package practice.javaprograms3;

import java.util.Arrays;


public class MissingElement {

	public static void main(String[] args) {
		int[] data = {3,2,1,4,6,7};
		
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			if (data[i]!=++i) {	
				System.out.println(i);
				break;
			}
			
		}

	}

}
