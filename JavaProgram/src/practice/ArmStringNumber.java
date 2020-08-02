package practice;

public class ArmStringNumber {

	public void isArmstrongNumber(int num) {

		int cube = 0;
		int r;
		int t;

		t = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);

		}
		if (t==cube) {
			System.out.println("The number is ArmStrong Number");
			
		}
		else {
			
			System.out.println("The number is not ArmStrong");
		}

	}

	public static void main(String args[]) {  
		
	

	}
}
