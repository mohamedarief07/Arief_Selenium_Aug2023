package practice.javaprograms3;

import java.util.Arrays;

public class MaxMinInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = { 1, 45, 77, 88, 33, 23, 4 };

		Arrays.sort(array);

		System.out.println("MinInGivenArray " + array[0]);
		System.out.println("MaxInGivenArray " + array[array.length - 1]);

	}

}
