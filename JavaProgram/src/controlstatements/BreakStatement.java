package controlstatements;

public class BreakStatement 
	 {
		public static void main (String[] args) 
		{
			for (int i = 0; i < 2; i++) 
			{
				for (int j = 0; j < 3; j++) 
				{
					System.out.print(i+" "+j+" ");
					break;
				}
				     
				System.out.println();
			}
		}
	}
	
// break statement can be used inside loop to come out of it.
// break statement can be used inside the switch block to come out of switch block.
// break statement can be used in nested block to go to the end of block. Nested block represent a block written within other block.