package assignment.week1.day2;

import java.util.Scanner;

public class FibbinocciScanner {

	public static void main(String[] args) {

		int p = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			p = p * i;

		}
		System.out.println("Fibonacci value for a given number is " + p);
		
		

	}

}
