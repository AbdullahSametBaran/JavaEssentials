import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0, mgrade = 0, fgrade = 0;
		double avg = 0;
		int x = 1;
		final int studentCount = 5;

		for (int k = 0; k < studentCount - 1; k++) {

			for (int i = 1; i < 3; i++) { // For mid-term which affects %25

				System.out.println("Please enter " + x + ". student " + i + ". midterm grade: ");

				mgrade = sc.nextInt();

				if (mgrade > -1 && mgrade <= 100) {
					sum += mgrade * 1 / 4;

				} else
					System.out.println("Invalid input." + i--);

			}

			System.out.println("Enter the final grade: ");
			fgrade = sc.nextInt();
			sum += fgrade * 1 / 2;
			x++;

			System.out.println("The " + k + ". student total grade: " + sum);
			sum = 0;
		}
	}

}
