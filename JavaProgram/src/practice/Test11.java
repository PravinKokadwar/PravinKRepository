package practice;

class LG3  // super class
{
int i;

LG3(int i)
{
this.i = i;	// accessing super class (LG3) variable 
}}

class LG4 extends LG3  // sub-class
{
int i;
LG4(int a,int b)  // sub-class para constructor
{
	super(a); // super class (LG3) constructor and pass a.
	i=b; // initilise sub-class variable
}

void show()
{
System.out.println("sub class i=" +i);
System.out.println("Super class i=" +super.i);
}}

public class Test11 {

	public static void main(String[] args) {
		LG4 t = new LG4 (15,18);
		t.show();

	}

}
