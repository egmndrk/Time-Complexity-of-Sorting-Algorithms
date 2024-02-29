import java.io.*;

public class insertion {
	public static void sort(int arr[]) {

		long n = arr.length;
		for (int k = 1; k < n; ++k) {
			 int key = arr[k];
			int j = k - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[1800000]; // Random 10000
		for (int a = 0; a < arr.length; a++) {
			arr[a] = (int) (Math.random() * 1800000);
		}
		long start = System.currentTimeMillis();

		 sort(arr);
		System.out.println("Sorted array:");
		printArr(arr);

		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println(" ");
		System.out.println(timeElapsed);
	}

}