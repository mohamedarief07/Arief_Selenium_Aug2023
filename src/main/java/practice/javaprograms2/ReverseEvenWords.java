package practice.javaprograms2;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String reverse = "";

		String[] split = test.split(" ");

		for (int i = 0; i < split.length; i++) {
			if (i % 2 != 0) {
				char[] charArray = split[i].toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					reverse = reverse + charArray[j];
				}

			} else {
				reverse = reverse + split[i];
			}
			if (i < split.length) {
				reverse = reverse + " ";
			}

		}
		System.out.println(reverse);

	}
}
