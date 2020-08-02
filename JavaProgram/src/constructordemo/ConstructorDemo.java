package constructordemo;

class Student {
	String name;
	int roll_no;
	double marks;
	String gender;

	Student(String nm, int rolln,double mark, String gdr) {
		name=nm;
		roll_no=rolln;
		marks=mark;
		gender=gdr;
	}

	void calculatePercentage() {
		System.out.println(marks / 100);
	}

}

public class ConstructorDemo {
	public static void main(String[] args) {
		Student s1 = new Student("Rohan",523,9623.32,"Male");
		System.out.println(s1.name+" "+s1.roll_no+" "+s1.marks+" "+s1.gender);
		
		Student s2= new Student("Sita", 987, 8687.98, "Female");
		System.out.println(s2.name+" "+s2.roll_no+" "+s2.marks+" "+s2.gender);
	}
}