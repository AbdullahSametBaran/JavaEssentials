import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your height");
		double h = sc.nextDouble();

		while (h >= 2.50) {
			System.out.println("Invalid input");
			System.out.println("Please enter your height like '1,80' cm");
			h = sc.nextDouble();
		}

		System.out.println("Please enter your weight");
		double w = sc.nextDouble();
		double BMI = w / (h * h);
		while (w >= 250) {
			System.out.println("Invalid input");
			System.out.println("Please enter your weight like '80' kg");
			w = sc.nextDouble();
		}
		System.out.println("Your BMI is " + BMI);

		if (BMI < 16) {
			System.out.println("Severe Thinness");
		} else if (16 < BMI && BMI < 17) {
			System.out.println("Moderate Thinness");
		} else if (17.5 < BMI && BMI < 18.5) {
			System.out.println("Mild Thinness");
		} else if (18.5 < BMI && BMI < 25) {
			System.out.println("Normal");
		} else if (25 < BMI && BMI < 30) {
			System.out.println("Overweight");
		} else if (30 < BMI && BMI < 35) {
			System.out.println("Obese Class I");
		} else if (30 < BMI && BMI < 35) {
			System.out.println("Obese Class II");
		} else if (BMI > 40) {
			System.out.println("Obese Class III");
			sc.close();
		}
	}
}