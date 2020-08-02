package practice;

class One
{
Two obj2;
//initialize obj2
One(Two obj2)
{
this.obj2=obj2; 
}
double cube(double x) 
{
	double result = x*obj2.square(x);
	return result;
}}

class Two
{
Three obj3;
Two (Three obj3)
{
this.obj3=obj3;
}
double square(double x) 
{
double result = x*obj3.get(x);	
return result;
}}

class Three
{
    public double get(double x) 
{
	return x;
}}
public class Relate2 {

	public static void main(String[] args) 
	{
	Three obj3= new Three();
	Two obj2 = new Two(obj3);
	One obj1 = new One(obj2);
	double result1 = obj1.cube(7);
	System.out.println("Cube of 7 =" + result1);
	double result2 = obj2.square(8);
	System.out.println("Square of 8 ="  + result2);

	}

}
