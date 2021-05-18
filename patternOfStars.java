import java.util.Scanner;

public class patternOfStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0-1-2-3-4-5 for alignment");

		while(true) {
		printStars(sc.nextInt());
		System.out.println();
		
		
		}
	}

	public static void printStars(int choice) {
		switch (choice) {

		case 0: // left
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 1: // right

			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 4 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 2: // square
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 3:
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5 - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 4:
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5 - i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < i + 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 5:
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.print(" ");
				for (int j = 0; j < 5 - i; j++) {
					System.out.print("*");
				}
				System.out.println();

			}

			break;

		case 6:
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < 5 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 5 - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		default:
			System.out.println("Wrong input");
		}
	}

}
