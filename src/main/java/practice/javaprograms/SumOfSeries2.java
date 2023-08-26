package practice.javaprograms;

import java.util.Scanner;

public class SumOfSeries2 {
	
	public static void main(String[] args) {
		
		
		double sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			
			sum=sum+(1.0/i*i);
			System.out.println("Series of value for a given number is " + sum);
		}
	
		
	}

}
