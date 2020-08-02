package constructordemo;

public class ConstructorWithThisKeyword {

	// Class(global) variable
	String name;
	int age;

	public ConstructorWithThisKeyword(String name, int age) {

		this.name = name; // this.globalVariable = local variable
		this.age = age; // this.globalVariable = local variable

		System.out.println(name);
		System.out.println(age);

	}

	public static void main(String args[]) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Pravin", 25);

	}

}
