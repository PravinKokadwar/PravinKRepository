package oopsConcepts2;

public class TestCar {

	public static void main(String args[]) {

		// Static Polymorphism -- Compile time polymorphism

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();

		System.out.println("****************");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();

		System.out.println("****************");

		// Top Casting
		Car c1 = new BMW(); // Child class object can be referred by parent class reference variable --
							// Dynamic Polymorphism(Run time polymorphism)
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();

	}

}
