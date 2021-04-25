import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to the calculator.\nPlease enter first number: ");
			int n1 = sc.nextInt();

			System.out.println("Second number:");
			int n2 = sc.nextInt();

			System.out.println("Type the operator: / , * , - , + , %");

			char char1 = sc.next().charAt(0);

			switch (char1) {

			case '+':
				System.out.println(n1 + n2);
				break;
			case '-':
				System.out.println(n1 - n2);
				break;
			case '*':
				System.out.println(n1 * n2);
				break;
			case '/':
				System.out.println(n2 != 0 ? (double) n1 / n2 : "Denominator cannot be zero");
				break;
			case '%':
				System.out.println(n1 % n2);
				break;
			default:
				System.out.println("Invalid operator.");

			}

		}

	}

}
