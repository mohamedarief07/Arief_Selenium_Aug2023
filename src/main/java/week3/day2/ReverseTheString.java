package week3.day2;

public class ReverseTheString {

	public static void main(String[] args) {
		String  input="Sharin";
		char[] charArray = input.toCharArray();
		
		for (int j = charArray.length-1; j >=0 ; j--) {
		
			
			System.out.print(charArray[j]);
			
		}
		
		
	
	}

}
