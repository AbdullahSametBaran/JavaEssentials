import java.util.Random;
import java.util.Scanner;

public class randomAssign {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Determine the size: ");
		int size = sc.nextInt();
		System.out.println("Give me the lower bound: ");
		int lower = sc.nextInt();
		System.out.println("Give me the upper bound: ");
		int upper = sc.nextInt();
		
		while(lower > upper) {
			System.out.println("The lower bound cannot be higher than the upper bound. \nPlease re-enter the values.");
			System.out.println("Give me the lower bound: ");
			lower = sc.nextInt();
			System.out.println("Give me the upper bound: ");
			upper = sc.nextInt();
		}
		
		int[] a = insertRandom(size,lower,upper);
		printArray(a);
		
		
	}

	private static void printArray(int[] a) {
		System.out.println("The random assigned numbers from the given input:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
	}

	private static int[] insertRandom(int size, int lower, int upper) {
		
		Random r = new Random();
		int[] a = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			a[i] = r.nextInt(upper-lower) + lower;
		}
		
		
		return a;
	}

}
