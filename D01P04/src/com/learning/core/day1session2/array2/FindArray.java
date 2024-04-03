package com.learning.core.day1session2.array2;

import java.util.Scanner;

public class FindArray {
	public static void main(String[] args) {

		int[] A = new int[18];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 18 values:");

		for (int i = 0; i < 18; i++) {

			A[i] = sc.nextInt();

		}

		int sum = 0;

		for (int i = 0; i < 15; i++) {

			sum += A[i];

		}

		A[15] = sum;

		double average = sum / 15.0;

		A[16] = (int) Math.round(average);

		int min = A[0];

		for (int i = 1; i < 18; i++) {

			if (A[i] < min) {

				min = A[i];

			}

		}

		A[17] = min;

		System.out.println("Output:");

		for (int i = 0; i < 18; i++) {

			System.out.print(A[i] + " ");

		}

		sc.close();

	}

}
