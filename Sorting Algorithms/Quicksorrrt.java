

import java.io.*;

public class Quicksorrrt {

	public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) {
		int idx = partition(array, startIdx, endIdx);

		if (startIdx < idx - 1) {
			recursiveQuickSort(array, startIdx, idx - 1);
		}

		if (endIdx > idx) {
			recursiveQuickSort(array, idx, endIdx);
		}
	}

	public static int partition(int[] array, int left, int right) {
		int pivot = array[left];

		while (left <= right) {

			while (array[left] < pivot) {
				left++;
			}

			while (array[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int tmp = array[left];
				array[left] = array[right];
				array[right] = tmp;

				left++;
				right--;
			}
		}

		return left;

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[100000]; // Random 10000
		for (int a = 0; a < arr.length; a++) {
			arr[a] = (int) (Math.random() * 100000);
		}
		long start = System.currentTimeMillis();
		
		recursiveQuickSort(arr, 0, arr.length - 1);
		System.out.println("Sorted array:");
		printArr(arr);

		
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println(" ");
		System.out.println(timeElapsed);
	}

}