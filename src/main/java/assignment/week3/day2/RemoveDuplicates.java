package assignment.week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {

		// 0 1 2 3
		String text = "We learn java basics as part of java sessions in java week1";

		String[] words = text.split(" ");

		for (int i = 0; i < words.length; i++) {
			String currentWord = words[i];
			int count = 0;

			for (int j = i + 1; j < words.length; j++) {
				if (currentWord.equals(words[j])) {
					count++;
				}
			}
			if (count > 0) {
				// Replace the duplicate word with an empty string
				words[i] = "";
			}
		}
		for (String current : words) {
			if (!current.isEmpty()) {
				System.out.print(current + " ");

			}

		}

	}
}
