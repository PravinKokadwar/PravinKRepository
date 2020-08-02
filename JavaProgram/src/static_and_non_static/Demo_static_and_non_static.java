package static_and_non_static;

//static -     property of class
//non_static - property of instance/object

class Student {
	String name, gender;
	int roll_no, marks;

	static String SCHOOL_NAME = "SVM";

	static void distributeSweets() {
		System.out.println("distributing sweets..." + SCHOOL_NAME);
	}

	void calculatePercentage() {
		int percentage = marks / 100;
		System.out.println(SCHOOL_NAME + " " + name + " " + (percentage));
	}
}

public class Demo_static_and_non_static {
	public static void main(String[] args) {
		System.out.println(Student.SCHOOL_NAME);
		Student.distributeSweets();

		Student s1 = new Student();
		System.out.println(s1.SCHOOL_NAME);
		Student.SCHOOL_NAME = "ABC";
		System.out.println(s1.SCHOOL_NAME);

		Student s2 = new Student();
		System.out.println(s2.SCHOOL_NAME);
	}
}