package oopsconcepts;

public class StaticAndNonStaticConcept {

	// global variables :: Scope of global var. will be available across all the function with some condition.

	String name = "Pravin";
	static int age = 25;

	public static void main(String args[]) {

		// How to call static methods and Variables ?
		// 1. direct calling
		sum();
		// 2.calling by classname
		StaticAndNonStaticConcept.sum();

		// Accessing Static variables

		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);

		// How to call Non-static method (By creating object) and Variables

		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);

		// Can i access static methods by using object reference ? YES, but it is not
		// good practice.
		obj.sum();
	}

	public void sendMail() {

		System.out.println("Send email Method");
	}

	public static void sum() {

		System.out.println("Sum method");
	}

}
