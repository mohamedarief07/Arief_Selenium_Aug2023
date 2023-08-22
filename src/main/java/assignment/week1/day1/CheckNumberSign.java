package assignment.week1.day1;

import java.util.Scanner;

public class CheckNumberSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int num;
		System.out.println("Enter num: ");

		num = myObj.nextInt();

		if (num > 0) {
			System.out.println("The given number " + num + " is positive");
		} else if (num == 0) {
			System.out.println("The number " + num + " is neither positive nor negative");
		} else
			System.out.println("The given number " + num + " is Negative");
	}

}
