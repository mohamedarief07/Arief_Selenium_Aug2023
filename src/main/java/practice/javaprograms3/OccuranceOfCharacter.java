package practice.javaprograms3;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		String str = "welcome to automation -afternoon  section arief sharin and sharif";
		int count =0;
		
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]=='a') {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
