import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int sum = 0, mgrade = 0, fgrade = 0;
		int x = 1, y = 1;
		System.out.println("Please enter how many student do you want to grade.");

		int studentCount = sc.nextInt();

		int values[] = new int[studentCount];

		for (int k = 1; k < studentCount + 1; k++) {

			for (int i = 1; i < 3; i++) { // For one each 2 mid-term which affects %25

				System.out.println("Please enter " + x + ". student " + i + ". midterm grade: ");

				mgrade = sc.nextInt();

				if (mgrade > -1 && mgrade <= 100) {
					sum += mgrade * 1 / 4;

				} else
					System.out.println("Invalid input." + i--);

			}

			System.out.println("Enter the final grade: ");
			fgrade = sc.nextInt();
			sum += fgrade *  1/2 ;

			System.out.println("The " + x + ". student total grade: " + sum);
			values[k - 1] = sum;
			sum = 0;
			x++;
		}
		for (int i = 0; i < values.length; i++) {

			System.out.print(y + ". student grade: " + values[i] + "\n");
			y++;
		}

	}

}
