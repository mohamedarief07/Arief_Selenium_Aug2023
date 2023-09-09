package assignment.week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		// output= 7;

		Set<Integer> set = new TreeSet<>();

		for (Integer each : data) {
			set.add(each);

		}
		//System.out.println(set);

		List<Integer> list = new ArrayList<>(set);
		Integer integer = list.get(list.size() - 2);
		System.out.println("Second Largest number : "+integer);

	}

}
