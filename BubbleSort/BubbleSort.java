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

		for (int member = 0; member < array.length; member++) {
			for (int j = member + 1; j < array.length ; j++) {

				if (array[member] > array[j]) {
					
					int temp = array[member];
					array[member] = array[j];
					array[j] = temp;
				}
			}
		}

	}

}
