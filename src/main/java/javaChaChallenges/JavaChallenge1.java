package javaChaChallenges;

public class JavaChallenge1 {
	/*
	 * Given a string s consisting of words and spaces, return the length of the
	 * last word in the string.
	 * 
	 * A word is a maximal substring consisting of non-space characters only.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with
	 * length 5.
	 * 
	 */

	public static void main(String[] args) {
		String Input = "luffy is still joyboy";

		String[] words = Input.split(" ");

		// System.out.println(words[words.length-1]);
		System.out.println("The length of the last word in the string is : " + words[words.length - 1].length());

	}
}
