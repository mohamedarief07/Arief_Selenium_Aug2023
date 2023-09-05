package assignment.week3.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// get the length of the array
		int length = arr.length;
		System.out.println("length: " + length);

		// declare an int variable named count

		// iterate from 0 to the array length-1 (outer loop starts here)

		for (int i = 0; i < length; i++) {
			//

			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);

				}

			}
		}

	}

}
