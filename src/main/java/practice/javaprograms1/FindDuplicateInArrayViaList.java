package practice.javaprograms1;

import java.util.HashSet;

import java.util.Set;

public class FindDuplicateInArrayViaList {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		Set<Integer> set = new HashSet<>();

		for (int dup : arr) {
			if (!set.add(dup)) {
				System.out.println("Duplicates in the array: " + dup);
			}

			
		}

	}

}
