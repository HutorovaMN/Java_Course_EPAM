package Module_2;

import java.util.Scanner;

public class Task_2_4 {
	/*
	 * ���� �������������� ����� �1 ,�2 ,..., �n . �������� ������� ���������� � ���������� ��������.
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter n");
			int n = scan.nextInt();
			int[] array = new int[n];
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int maxi = 0;
			int mini = 0;
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
				if (array[i] > max) {
					max = array[i];
					maxi = i;
				}
				if (array[i] < min) {
					min = array[i];
					mini = i;
				}
			}
			int temp = array[maxi];
			array[maxi] = array[mini];
			array[mini] = temp;
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
		}

	}

}