import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Numbers would assign randomly up 0 to 100, determine the count: ");
		int[] a = new int[sc.nextInt()];
		System.out.println("Unsorted version:");
		fillArray(a);
		displayArray(a);
		int[] k = a;
		System.out.println("\nSorted version: ");
		bubbleSort(k);
		displayArray(k);

	}

	static void fillArray(int[] x) {

		Random r = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = r.nextInt(100);
		}

	}

	static void displayArray(int[] k) {
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i] + "\t");
		}
	}

	static void bubbleSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

	}

}
