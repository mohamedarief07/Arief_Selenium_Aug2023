package week4.day1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
		String companyName = "google";

		char[] charArray = companyName.toCharArray();

		Set<Character> set = new LinkedHashSet<>();

		for (Character ch : charArray) {
			set.add(ch);

		}
		System.out.println(set);

		Object[] array = set.toArray();
		for (Object object : array) {
			System.out.print(object);
		}

	}

}
