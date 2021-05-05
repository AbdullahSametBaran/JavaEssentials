import java.util.ArrayList;
import java.util.Scanner;

public class itemCollector {

	public static void main(String[] args) {

		ArrayList<String> item = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		boolean exit = false;

		System.out.println(
				"If you want to add item into list, just type and press enter.\nIf you want to display items write: display ");

		while (exit == false) {

			item.add(sc.next());
			if (item.contains("display")) {
				exit = true;
			}

		}
		item.remove("display");
		System.out.println("Your items are: ");
		display(item);
		System.out.println("\nDo you wanna remove item, type it name: ");

		String ab = sc.next();
		while (item.contains(ab) != true) {

			System.out.println("Ýtem does not founded, type again: ");
			ab = sc.next();

		}
		System.out.println("\nYour updated item list:");
		display(item);

	}

	static void display(ArrayList<String> list) {
		for (String i : list) {
			System.out.print(i + "\t");
		}

	}

}
