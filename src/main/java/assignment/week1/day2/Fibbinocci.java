package assignment.week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// Print Fibbinocci series for first 11 numbers

//0  1  1  2  3  5  8  13  21  34  55  89  144

//		Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
//		Print first number
//		Iterate from 1 to the 11
//		Add first and second number assign to sum
//		Assign second number to the first number
//		Assign sum to the second number
//		Print sum
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;

		System.out.println(firstNum);
		System.out.println(secNum);

		for (int i = 1; i <= 11; i++) {

			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;

			if (sum <= 56) {
				System.out.println(sum);

			}
		}
	}

}
