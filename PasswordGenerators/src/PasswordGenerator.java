import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		ArrayList<String> password = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the password generator. "
				+ "Before start lets determine the randomly generated password length,\n"
				+ "enter the value: "
				+ "\n(Value cannot be below 5)");
		int value = sc.nextInt();
		while(value < 5) {
			System.out.println("Invalid input, try again.");
			value =sc.nextInt();
		}
		System.out.println("How much password do you want generate? : ");
		int count = sc.nextInt();
		
		
		for (int i = 0; i < count; i++) {
			generatePassword(value);
		}
		
		
	}
	
	static void generatePassword(int a) {
		
		char[] symbols = {'£','#','$','%','*','?','-'};
		char[] upper = new char[26];
		char[] lower = new char[26];
		
		for (int i = 0; i < upper.length; i++) {
			upper[i] = (char) ('A' + i); 
		}
		for (int i = 0; i < lower.length; i++) {
			lower[i] = (char) ('a' +i);
		}
		
		Random r = new Random();
		
		String K= "";
		
		for (int i = 0; i < a; i++) {
			
			int s = r.nextInt(4);
			
			switch(s) {
			case 0:
				K += r.nextInt(10);break;
			case 1:
				K += symbols[r.nextInt(symbols.length)];break;
			case 2:
				K += upper[r.nextInt(upper.length)];break;
			case 3:
				K += lower[r.nextInt(lower.length)];break;
			
			}
			
			
		}
		
		
		
		System.out.println(K);
		
	}
}
