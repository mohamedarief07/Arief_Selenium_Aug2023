package assignment.week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester in my projrct";
		String[] words = test.split(" ");
		String result = "";

		for (int i = 0; i < words.length; i++) {
			if (i % 2 != 0) {
				char[] wordChars = words[i].toCharArray();
				for (int j = wordChars.length - 1; j >= 0; j--) {
					result = result + wordChars[j];
				}

			} else {
				result = result + words[i];
			}

			if (i < words.length) {
				result = result + " ";
			}
		}
		System.out.println(result);
	}
}