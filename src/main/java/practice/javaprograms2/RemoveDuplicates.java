package practice.javaprograms2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(split));

		Set<String> set = new LinkedHashSet<String>(list);
		
		for (String string : set) {
			System.out.print(string+ " ");
			
		}
	}

}
