
public class Employee {

	private Name fullName;
	private int age;
	private int salary;

	public Employee(Name fullName, int age, int salary) {
		this.fullName = fullName;
		this.age = age;
		this.salary = salary;
	}

	public Name getFullName() {
		return fullName;
	}

	public void setFullName(Name fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return String.format("%s (Age: %s) earns %s.", fullName, age, salary);
	}

}
