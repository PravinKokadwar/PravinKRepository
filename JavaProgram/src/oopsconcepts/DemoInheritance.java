package oopsconcepts;

//super - immediate parent object's reference

class Dog
{
	int i=10;
	void bark()
	{
		System.out.println("barking...");
	}
}

class PuppyDog extends Dog
{
	int i=12;
	void weep()
	{
		System.out.println("weeping..."+super.i);
	}
}

class GrandPuppyDog extends PuppyDog
{
	int i=18;
	void play()
	{
		System.out.println("playing..."+super.i);
	}
}

public class DemoInheritance 
{
       public static void main(String[] args) {
		
		GrandPuppyDog gpd=new GrandPuppyDog();
		gpd.bark();
		gpd.play();
		gpd.weep();
		System.out.println(gpd.i+" "+gpd.i+" "+gpd.i);
	}
}