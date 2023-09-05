package assignment.week3.day2;



public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";

		char[] charArray = test.toCharArray();
		for (int i = 0; i < test.length(); i++) {
			if (i % 2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
				System.out.print(charArray[i]);
			} else {
				System.out.print(charArray[i]);

			}

		}
	}
}
