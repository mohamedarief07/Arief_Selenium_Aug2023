package CodeReview;

public class Factorial {

		
		public static int getFactorial(int num) {
	        if (num == 0 || num == 1) {
	            return 1;
	        } else {
	            return num * getFactorial(num - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int inputNumber = 6; // You can replace this with any non-negative integer
	        int result = getFactorial(inputNumber);
	        System.out.println("The factorial of " + inputNumber + " is " + result);
	    }
	}