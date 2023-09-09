package practice.javaprograms1;

public class Palindrome {
	
	 public static boolean checkPalindrome(String str) {
		// Remove spaces and convert the string to lowercase for case-insensitive comparison
	        str = str.replaceAll("\\s", "").toLowerCase();
	        
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        
	        return true;
	    }


	public static void main(String[] args) {


		String input = "MADAM";
        boolean isPalindrome = checkPalindrome(input);
        System.out.println(isPalindrome);

	}

}
