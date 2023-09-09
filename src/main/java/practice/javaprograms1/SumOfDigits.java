package practice.javaprograms1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// * Goal: Find the sum of digits of a given number
	
		// * input: 123
		// * output: 1+2+3 = 6
		
		
		
		// Declare your input number (int)
		int input= 123;

				// Initialize an integer variable by name: sum
		
		int sum;
		int reminder;
		
		while (input>0) {
			reminder=input%10;
			System.out.println(reminder);
			sum=reminder;
			System.out.println(sum);
		}

				// Use loop to calculate the sum: use while loop to set condition until the number goes greater than 0

				// Within loop: get the remainder when done by 10 -> Tip: use mod %

					// Print the remainder to confirm
			
					// Within loop: add that remainder to the sum
			
					// Print the sum to confirm
			
					// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			
					// Print the quotient to confirm
				
				// Outside the loop: print the final sum

	}

}
