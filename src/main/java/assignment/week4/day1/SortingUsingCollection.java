package assignment.week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] text = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		ArrayList<String> list = new ArrayList<>(Arrays.asList(text));

		Collections.sort(list);
		Collections.reverse(list);

		
		/*
		 * for (String string : list) { System.out.println(string); }
		 */
		System.out.println(list);

	}

}
