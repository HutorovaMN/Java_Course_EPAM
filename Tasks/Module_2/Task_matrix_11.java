package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_11 {
	/*
	 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
	 * матрицу и номера строк, в которых число 5 встречается три и более раз.
	 */

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the size of the array that is to be created:");
			int n = scan.nextInt();
			matrix(n);
		}
	}

	public static void matrix(int n) {
		Random ran = new Random();
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = ran.nextInt(15);
			}
		}
		System.out.println("Matrix: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.print(i + " ");
			}
		}
	}
}
