package oopsConcepts2;

public class BMW extends Car {

	public void start() {

		// When same method is present in Parent class and child class with same name
		// and same number of argument,
		// called Method Overriding

		System.out.println("BMW Car started");

	}

	public void theftSafety() {

		System.out.println("BMW car is protected againest theft");
	}
}
