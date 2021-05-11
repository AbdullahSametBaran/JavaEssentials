import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		String first = "", last = "";
		int a = 0, s = 0;

		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("If you want to finish program, write exit in first Name part");

		while (true) {

			System.out.println("Write First Name of the Employee");
			first = sc.next();

			if (first.equals("exit")) {
				break;
			}

			System.out.println("Last Name: ");
			last = sc.next();
			System.out.println("Age: ");
			a = sc.nextInt();
			System.out.println("Salary: ");
			s = sc.nextInt();

			Name name = new Name(first, last);
			arrayList.add(new Employee(name, a, s));

		}
		for (Employee m : arrayList) {
			System.out.println(m + "\n");
		}
		System.out.println("Total employees count: " + arrayList.size());
	}
}
