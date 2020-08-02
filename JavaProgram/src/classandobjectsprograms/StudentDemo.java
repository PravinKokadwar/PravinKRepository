package classandobjectsprograms;

class Student
{
	String name;
	int roll_no;
	double marks;
	String gender;
	boolean isdisable;
	
	void calculatePercentage()
	{
		System.out.println(marks/100);
	}
}

public class StudentDemo 
{	
	public static void main(String[] args) 
	{
		Student s1;
		s1=new Student();
		System.out.println(s1);
		System.out.println(s1.isdisable+" "+s1.name+" "+s1.roll_no+" "+s1.marks+" "+s1.gender);
		s1.name="Mohan";
		s1.roll_no=420;
		s1.marks=9600;
		s1.gender="Male";
		System.out.println(s1.name+" "+s1.roll_no+" "+s1.marks+" "+s1.gender);
		
		Student s2=new Student();
		System.out.println(s2);
		s2.name="Sita";
		s2.roll_no=678;
		s2.marks=9900;
		s2.gender="Female";
		System.out.println(s2.name+" "+s2.roll_no+" "+s2.marks+" "+s2.gender);
		
		Student s3=s1;
		System.out.println(s3+"  "+s1);
		System.out.println(s3.name+" "+s3.roll_no+" "+s3.marks+" "+s3.gender);
	}
}