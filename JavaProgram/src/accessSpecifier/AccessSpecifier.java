package accessSpecifier;

public class AccessSpecifier 
{
	public int x;
	protected int y;
	int z;
	// private int w;
}

class ABC
{
	public void display()
	{
		@SuppressWarnings("unused")
		AccessSpecifier asf = new AccessSpecifier();
	}

}