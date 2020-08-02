package practicesession;

class One {
	int a;
	Two t; // class two's reference

	One(Two t) { // constructor that receive two's reference
		this.t = t;
		a = 10;

	}

	void display() {
		System.out.println("One a = " + a);
		t.display();
		System.out.println("Two var" + t.b);

	}

}

class Two {

	int b;

	Two(int b) {

		this.b = b;

	}

	void display() {

		System.out.println("Two b= " + b);
	}
}

public class RelateClassOne {
	public static void main(String args[]) {

		Two obj2 = new Two(22);
		One obj1 = new One(obj2);
		obj1.display();

	}
}
