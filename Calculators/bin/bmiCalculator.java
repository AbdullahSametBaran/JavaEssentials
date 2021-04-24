import java.util.Scanner;

public class bmiCalculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("give me your height");
		double h = sc.nextDouble();

		while (h >= 2.50) {
			System.out.println("invalid input");
			System.out.println("give me your height");
			h = sc.nextDouble();
		}

		System.out.println("give me your weight");
		double w = sc.nextDouble();
		double BMI = w / (h * h);
		while (w >= 250) {
			System.out.println("invalid input");
			System.out.println("give me your weight");
			w = sc.nextDouble();
		}
		System.out.println("Your BMI is " + BMI);

		if (BMI < 20) {
			System.out.println("You are so thin. Should eat smt");
		} else if (20 < BMI && BMI < 25) {
			System.out.println("You are avarage weighted. Go and live happy");
		} else if (25 < BMI && BMI < 40) {
			System.out.println("You are obese. You should do exercise");
		} else if (BMI > 40) {
			System.out.println("YOU ARE SO OVERWEIGHTED. YOU SHOULD GO TO DOCTOR ASAP");
			sc.close();
		}
	}
}
