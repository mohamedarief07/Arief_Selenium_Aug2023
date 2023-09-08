package practice.javaprograms;

import java.util.ArrayList;
import java.util.List;

public class LearnListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();

		list.add("Vijay");
		list.add("Ajith");
		list.add("Rajini");
		list.add("Dhanush");
		list.add("Simbu");
		list.add("Vikram");
		list.add("Kamal");
		list.add("SK");
		list.add("Dhanush");

		list.add(3, "Surya");

		list.set(8, "Siva");

		list.remove("Simbu");

		String string2 = list.get(6);
		System.out.println("string2  : " + string2);

		boolean contains = list.contains("Vikram");
		System.out.println("contains  : " + contains);
		
		boolean empty = list.isEmpty();
		System.out.println("empty  : " + empty);

		int size = list.size();
		System.out.println(" size of the list  : " + size);

		System.out.println(list);

		System.out.println("==================================================================");

		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("==================================================================");

		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));

		}
		System.out.println("==================================================================");
		
		list.clear();
		
		boolean afterClear= list.isEmpty();
		System.out.println("afterClear  : " + afterClear);
		
		System.out.println(list);

	}

}
