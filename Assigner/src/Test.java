
public class Test {
	
	public static void main(String[] args) {
		Student s1 = new Student("Chris", "David");
		Student s2 = new Student("Elanor", "Hetna", 2.011);
		Student s3 = new Student("Robert", "Fiel", 2.7771);
		Student s4 = new Student("Harper", "Cater", 3.213);
		Student s5 = new Student("Fiona", "Kotes", 3.6);
		
		Course sen1001 = new Course("SEN1001", "Introduction to Programming (JAVA)");
		Course psy1001 = new Course("PSY1001", "Introduction to Psychology");
		
		sen1001.addStudent(s1);
		sen1001.addStudent(s2);
		sen1001.addStudent(s3);
		System.out.println(sen1001);
		
		psy1001.addStudent(s1);
		psy1001.addStudent(s2);
		psy1001.addStudent(s3);
		System.out.println(psy1001);

		System.out.println("Increasing size to 7.");
		psy1001.setSize(7);
		System.out.println(psy1001);
		psy1001.addStudent(s4);
		psy1001.addStudent(s5);
		System.out.println(psy1001);

		System.out.println("Removing student s2: " + s2.getFullName());
		psy1001.removeStudent(s2);
		System.out.println(psy1001);

		psy1001.clearStudents();
		System.out.println("After removing all students from PSY1001 course:");
		System.out.println(psy1001);
		
		Course course = sen1001;
		Student student = s2;
		
		if(course.findStudent(student))
			System.out.printf("%s takes %s.", student.getFullName(), course.getCourseName());
		else
			System.out.printf("%s does not take %s.", student.getFullName(), course.getCourseName());
			
	}



}
