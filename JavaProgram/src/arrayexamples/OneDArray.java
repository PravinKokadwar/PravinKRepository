package arrayexamples;

public class OneDArray 
{
	
	public static void main(String args[]) 
	{
	 int a[]= new int[3];
	 a[0]=10;
	 a[1]=20;
	 a[2]=30;
	 System.out.println("a.length");
	 
	 for (int i=0;i<a.length;i++) 
	 {
	   System.out.println("a[i]");
	   
	 }
	 System.out.println("-------------");
	 for (int k:a)
	 {
		 System.out.println(k);
	 }
	}
	
	
	
	
	
	
}