package practice.javaprograms3;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153;

		int calculated = 0, reminder, original;

		original = n;
		while (n > 0) {
			reminder = n % 10;
			n = n / 10;
			calculated = calculated + (reminder * reminder * reminder);
		}

		if (original == calculated)
			System.out.println(original + " is armstrong number");
		else
			System.out.println(original + " is not armstrong number");
	}

}
