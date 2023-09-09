package practice.javaprograms3;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 17;
		boolean bNonPrime = false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(n + " is Non Prime");
				bNonPrime = true;
				break;
			}
		}
		if (!bNonPrime)
			System.out.println(n + " is Prime");
	}

}
