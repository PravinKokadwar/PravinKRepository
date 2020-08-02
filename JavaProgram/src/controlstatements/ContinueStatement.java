package controlstatements;

public class ContinueStatement {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
	
// continue statement can be used to inside the loop to repeat the next iteration of the loop. 
//When continue statement is executed subsequent statement are not executed and control of execution goes back to next repetition of the loop.

