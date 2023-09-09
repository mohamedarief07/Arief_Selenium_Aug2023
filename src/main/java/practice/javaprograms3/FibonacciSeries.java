package practice.javaprograms3;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;

		int f1 = 0;
		int f2 = 1;
		int sum = 0;

		System.out.println(f1);
		System.out.println(f2);
		for (int i = 1; i <= n; i++) {
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			System.out.println(sum);

		}

	}

}
