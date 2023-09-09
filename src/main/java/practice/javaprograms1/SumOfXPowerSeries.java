package practice.javaprograms1;

import java.util.Scanner;

public class SumOfXPowerSeries {
	
	public static void main(String[] args) {
		
		
		double sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X and N: ");
		int n = sc.nextInt();
		int x = sc.nextInt();
		for (int i = 1; i <=n; i++) {
			
			sum=sum+Math.pow(x, i);
			System.out.println("Series of value for a given number is " + sum);
		}
	
		
	}

}
