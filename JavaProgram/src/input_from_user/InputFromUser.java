package input_from_user;

import java.util.Scanner;

public class InputFromUser {
	public static void main(String[] args) {
/*		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		System.out.println("Entrered number is: "+a);
		
		System.out.println("Enter another number");
		int b= sc.nextInt();
		System.out.println("Entrered number is: "+b);

		System.out.println(a+b);
		*/
		
//		System.out.println(System.currentTimeMillis());
		java.util.Date d=new java.util.Date();
		System.out.println(d);
		
		java.sql.Date d1=new java.sql.Date(1529828583196l);
		System.out.println(d1);
	}
}