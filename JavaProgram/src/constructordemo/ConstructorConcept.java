package constructordemo;

public class ConstructorConcept {

	public ConstructorConcept() {

		System.out.println("This is default constructor");
	}

	public ConstructorConcept(int i) {

		System.out.println("Single parameter Constructor");
		System.out.println("The value of i " + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("Two Parameter Constructor");
		System.out.println("The value of i " + i);
		System.out.println("The value of J " + j);

	}

	// The moment we create object, Default constructor is created.
	
	public static void main(String args[]) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(100);
		ConstructorConcept obj2 = new ConstructorConcept(100, 200);

	}

}
