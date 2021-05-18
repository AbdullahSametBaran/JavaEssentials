import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Enter a number for start the game");
		gameRPS(sc.nextInt(), r.nextInt(3));

	}

	public static void gameRPS(int user, int computer) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int countdownu = 0;
		int countdownc = 0;
		while (true) {
			computer = r.nextInt(3);// [0,3)
			System.out.println("\nThe game has started");
			System.out.println("Enter an integer");
			System.out.println("scissor(0) , rock(1) , paper(2)");
			user = sc.nextInt();
			System.out.print("The computer is\t ");
			switch (computer) {
			case 0:
				System.out.print("scissor.\t");
				break;
			case 1:
				System.out.print("rock.\t ");
				break;
			case 2:
				System.out.print("paper.\t");
				break;
			}
			System.out.print("You are : ");
			switch (user) {
			case 0:
				System.out.println("scissor ");
				break;
			case 1:
				System.out.println("rock  ");
				break;
			case 2:
				System.out.println("paper ");
				break;
			}
			if (computer == user) {
				System.out.print("too. It is a draw.");
			} else {
				boolean win = (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1);
				if (win) {
					System.out.println("You won");
					countdownu++;
					System.out.println("you are " + countdownu);
				}

				else {
					System.out.println("You lost");
					countdownc++;
					System.out.println("computer is " + countdownc);
				}
			}
			if (countdownc == 5 || countdownu == 5) {
				System.out.println("it is over");
				break;
			}
		}
	}

}
