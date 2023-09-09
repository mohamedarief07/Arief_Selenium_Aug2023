package practice.javaprograms1;

public class ReverseString {

	public static boolean isPrime(int n) {	
		boolean bNonPrime =true;
		
		if(n<0) {
			throw new IllegalArgumentException("Negative Number");
		}
		
		for( int i=2;i<=n/2;i++) {
			if(n%i==0) {
				bNonPrime = false;
				break;
			}
		}
		return bNonPrime;
	}
	
	public static void main(String[] args) {
		
		System.out.println(ReverseString.isPrime(17));
	}
}