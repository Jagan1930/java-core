package com.learning.core.day4session2.sort2;

public class TestMergeSort {
	public static void mergeSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		int mid = arr.length / 2;
		int[] leftHalf = new int[mid];
		int[] rightHalf = new int[arr.length - mid];

		System.arraycopy(arr, 0, leftHalf, 0, mid);
		System.arraycopy(arr, mid, rightHalf, 0, arr.length - mid);

		mergeSort(leftHalf);
		mergeSort(rightHalf);

		merge(arr, leftHalf, rightHalf);
	}

	public static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
		int i = 0, j = 0, k = 0;

		while (i < leftHalf.length && j < rightHalf.length) {
			if (leftHalf[i] <= rightHalf[j]) {
				arr[k++] = leftHalf[i++];
			} else {
				arr[k++] = rightHalf[j++];
			}
		}

		while (i < leftHalf.length) {
			arr[k++] = leftHalf[i++];
		}

		while (j < rightHalf.length) {
			arr[k++] = rightHalf[j++];
		}
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Original array:");
		printArray(arr);

		mergeSort(arr);

		System.out.println("Sorted array:");
		printArray(arr);
	}

}
