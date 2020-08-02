package oopsconcepts;

class Animal 
{
	void breath() 
	{
		System.out.println("breathing...");
	}
}

class Cat extends Animal 
{
	void sound() 
	{
		System.out.println("meow...");
	}
}

class Elephant extends Animal
{
	void voice()
	{
		System.out.println("trumpet");
	}

}

public class HierarchicalInheritance 
{
	public static void main(String[] args) 
	{
		Elephant ele=new Elephant();
		
		Cat c=new Cat();
		
	}
}