package practice.javaprograms1;

import java.util.ArrayList;
import java.util.List;

public class PrintTheOccuranceOfAdam {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("Ben");
		list.add("James");
		list.add("Adam");
		list.add("George");
		list.add("Adam");
		int count = 0;
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).contains("Adam")) {
			
				count++;

			}

		}System.out.println("Number of Time Adam occured are : " +count);

	}

}
