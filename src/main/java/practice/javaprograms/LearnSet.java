package practice.javaprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new LinkedHashSet<String>();

		set.add("Vijay");
		set.add("Ajith");
		set.add("Rajini");
		set.add("Dhanush");
		set.add("Simbu");
		set.add("Vikram");
		set.add("Kamal");
		set.add("SK");
		set.add("Dhanush");

		set.remove("Simbu");

		boolean contains = set.contains("Vikram");
		System.out.println("contains  : " + contains);

		boolean empty = set.isEmpty();
		System.out.println("empty  : " + empty);

		int size = set.size();
		System.out.println(" size of the set  : " + size);

		System.out.println(set);

		System.out.println("==================================================================");

		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("==================================================================");

		set.clear();

		boolean afterClear = set.isEmpty();
		System.out.println("afterClear  : " + afterClear);

		System.out.println(set);

	}

}
