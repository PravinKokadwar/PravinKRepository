package arrayexamples;

public class TwoDArray 
{
public static void main(String[] args) 
	{
		int a[][]=new int[2][3];
		a[0][0]=98;
		a[0][1]=54;
		a[0][2]=76;
		
		a[1][0]=65;
		a[1][1]=87;
		a[1][2]=75;
		
		System.out.println("rows: "+a.length);
		System.out.println("columns: "+a[0].length);
		
		int rows=a.length;
		int columns=a[0].length;
		
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++) 
			{
				System.out.print(i+" "+j+"-"+a[i][j]+" ");
			}
			System.out.println();
		}
}
}

