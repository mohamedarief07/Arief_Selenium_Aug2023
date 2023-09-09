package assignment.week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		
		ArrayList<String> list =new ArrayList<>(Arrays.asList(split));
		
		Set<String> set=new LinkedHashSet<>(list);
		
		for (String string : set) {
			System.out.print(string+ " ");
		}
		

	}

}
