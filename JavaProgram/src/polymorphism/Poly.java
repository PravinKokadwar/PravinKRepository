package polymorphism;

class Vivo {

	static void calculate(double a) {
		System.out.println("Squar value = " + (a * a));

	}
}

class Samsung extends Vivo {

	static void calculate(double a) {
		System.out.println("Square root value = " + Math.sqrt(a));

	}

}

class Poly {
	public static void main(String args[]) {

//		Vivo v = new Samsung(); This is called main class method Square.
		// v.calculate(36);

		Samsung s = new Samsung();  // This is called sub-class method
		s.calculate(100);
		
		
	}

}
