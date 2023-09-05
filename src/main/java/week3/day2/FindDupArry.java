package week3.day2;

public class FindDupArry {

	public static void main(String[] args) {
		int[] scores = { 2, 5, 7, 7, 5, 9, 2, 3 };

		int count = 0;

		for (int i = 0; i < scores.length; i++) {

			for (int j = i + 1; j < scores.length; j++) {
				if (scores[i] == scores[j]) {
					count++;

					System.out.println(scores[i]);

				}

			}

		}

	}

}
