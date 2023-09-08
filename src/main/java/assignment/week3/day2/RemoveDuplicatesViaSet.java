package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesViaSet {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] split = text.split(" ");

		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(split));

		Set<String> set = new LinkedHashSet<String>(strList);

		for (String string1 : set) {

			System.out.print(string1 + " ");

		}
	}

}