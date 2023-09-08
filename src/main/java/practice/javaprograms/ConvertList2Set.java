package practice.javaprograms;

import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class ConvertList2Set {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Vijay");
		list.add("Ajith");
		list.add("Rajini");
		list.add("Dhanush");
		list.add("Simbu");
		list.add("Vikram");
		list.add("Kamal");
		list.add("SK");
		list.add("Dhanush");
		
		System.out.println("list.size: "+list.size());
		System.out.println(list);
		
		for (String string : list) {
			System.out.println(string);
			
		}
		System.out.println("===============================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Set<String> set=new LinkedHashSet<String>();
		set.addAll(list);
		
		System.out.println("set.size: "+set.size());
		System.out.println(set);
		

		
		
	}

}
