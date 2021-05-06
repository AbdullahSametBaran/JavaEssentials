import java.util.Scanner;

public class checkPrimeAndPerfect {

	public static void main(String[] args) {
		while (true) {

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"Enter a number, if you want to learn on its prime and perfect number status.\nPlease press [-1] to exit system.");
			int n = sc.nextInt();
			if (n == -1) {
				System.out.println("You logged out");
				break;
			}
			System.out.println(checkPrime(n) ? n + " is a prime number." : n + " is not a prime number.");
			System.out.println(checkPerfect(n) ? n + " is perfect." : n + "is not perfect.");
			System.out.println();

		}
	}

	public static boolean checkPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static boolean checkPerfect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum == n ? true : false;

	}

}
