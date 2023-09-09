package practice.javaprograms2;

public class Palindrome {

	public static void main(String[] args) {

		String text01 = "MaDaM";

		StringBuilder builder = new StringBuilder(text01);
		String text02 = builder.reverse().toString();

		if (text01.equalsIgnoreCase(text02)) {
			System.out.println("Given word " + text01 + " is a Palindrome ");

		} else {
			System.out.println("Given word " + text01 + " is not a Palindrome ");

		}

	}

}
