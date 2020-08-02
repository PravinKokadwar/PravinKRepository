package practicesession1;

class Sample {

	private double num1, num2;

	Sample(double x, double y) {
		num1 = x;
		num2 = y;
	}

	void sum() {
		double res = num1 + num2;
		System.out.println("Sum= " + res);

	}

}

class methods {
	public static void main(String args[]) {

		Sample s = new Sample(10, 22.5);
		s.sum();
		//s.hashCode();
		

	}
}