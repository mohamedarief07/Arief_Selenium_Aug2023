package assignment.week4.day1;

import java.util.ArrayList;
import java.util.Collections;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 4, 2, 1, 6, 3, 5, 10, 8, 9 };

		ArrayList<Integer> list = new ArrayList<>();

		for (Integer integer : data) {
			list.add(integer);
		}

		Collections.sort(list);

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != ++i) {
				System.out.println(i);
				break;

			}

		}

	}

}
