package demo;

//this - current class's object reference
class Student {
	String name;
	int roll_no;
	double marks;
	String gender;
	
	Student(String name, int roll_no,double marks, String gender) {
		this.name=name;
		this.roll_no=roll_no;
		this.marks=marks;
		this.gender=gender;
	}
	
	void calculatePercentage() {
		System.out.println(marks / 100);
	}
}


public class Demo_this {
	public static void main(String[] args) {
		Student s1=new Student("Rohan",456,4657.00,"Male");
		System.out.println(s1.name+" "+s1.roll_no+" "+s1.marks+" "+s1.gender);
	}
}