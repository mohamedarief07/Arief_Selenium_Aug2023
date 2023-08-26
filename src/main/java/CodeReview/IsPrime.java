package CodeReview;

public class IsPrime {
	


	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        
	        if (num <= 3) {
	            return true;
	        }
	        
	        if (num % 2 == 0 || num % 3 == 0) {
	            return false;
	        }
	        
	        // Check for factors up to the square root of the number
	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }

	    public static void main(String[] args) {
	        int inputNumber =21; // You can replace this with any positive integer
	        boolean result = isPrime(inputNumber);
	        
	        if (result) {
	            System.out.println(inputNumber + " is prime.");
	        } else {
	            System.out.println(inputNumber + " is not prime.");
	        }
	    }
	}



