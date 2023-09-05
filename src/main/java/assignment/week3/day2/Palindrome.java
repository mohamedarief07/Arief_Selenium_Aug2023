package assignment.week3.day2;

public class Palindrome {

	public static void main(String[] args) {

		String text01 = "Murdrum";
		String reverse = "";
		System.out.println("text01 :" + text01);

		char[] charArray = text01.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			reverse = reverse + charArray[i];

		}

		System.out.println("text02 :" + reverse);

		if (text01.equalsIgnoreCase(reverse)) {
			System.out.println("Given word " + text01 + " is a Palindrome ");

		} else {
			System.out.println("Given word " + text01 + " is not a Palindrome ");

		}
	}

}
