package practice.javaprograms1;

public class Palindromeqwe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text01 = "MaDAm";

		StringBuilder text02 = new StringBuilder(text01);
		String reverse = text02.reverse().toString();

		if (reverse.equalsIgnoreCase(text01)) {
			System.out.println(reverse + " is Palindrome");
		} else {
			System.out.println(reverse + " is not Palindrome");

		}

	}

}
