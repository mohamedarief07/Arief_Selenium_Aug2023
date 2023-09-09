package practice.javaprograms1;

import java.util.ArrayList;
import java.util.List;

public class PrintOnlyDuplicateArray {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("Ben");
		list.add("James");

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					System.out.println("Duplicate Names are : " + list.get(i));

				}
			}

		}

	}

}
