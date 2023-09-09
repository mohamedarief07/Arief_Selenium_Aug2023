package assignment.week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInCharacters {

	public static void main(String[] args) {
		String text = "PayPal India";
		String case1 = text.toLowerCase();
		String replaceAll = case1.replaceAll(" ", "");

		char[] charArray = replaceAll.toCharArray();

		Set<Character> set = new LinkedHashSet<>();
		for (Character eachcharacter : charArray) {
			set.add(eachcharacter);
		}

		//System.out.println(set);

		for (Character charr : set) {
			System.out.print(charr);
		}

	}

}
