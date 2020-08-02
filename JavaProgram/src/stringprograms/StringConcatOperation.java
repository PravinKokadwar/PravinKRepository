package stringprograms;

public class StringConcatOperation 
{

	public static void main(String args[]) 
{
	 String S1= "I am learning JAVA";
	 String S2= new String ("I like programming");
	 
	 String S3 = S1.concat(S2);
	 System.out.println(S3);
		
	 String S4 = "I Do regular practise";
	 String S5 = new String("Regular practise is good for programming");
	 
	 String S6=S4.concat(S5);
	 System.out.println(S6);
	 
	 String S7 = "Programming is very good for mind";
	 String S8 = new String ("Also good for study");
	 
	 String S9=S7.concat(S8);
	 
	 System.out.println(S9);
}
	
}
