class Animal{
	void move() {
		System.out.println("Animals moving");
	}
	
	static void eat()
	{
		System.out.println("Animals can eat grass or meat or both.");
	}
	
	final void run() {//final methods cannot be overridden
		System.out.println("Running............");
	}
	
}
class Dog extends Animal{
	void move() {//overriding
		System.out.println("Dogs moving....");		
	}
	
	/* Static methods cannot be overridden, they need to be redeclared
	  void eat() {
		System.out.println(" Dogs eat meat");
	}*/ 
	
	static void eat() {//redeclaradtion
		System.out.println(" Dogs eat meat");
	}
	
	void bark() {
		System.out.println("Dogs barking....");
	}
}
public class practiceOverriding {
	public static void main(String args[]) {
		Animal a=new Animal();//Animal reference and Animal object
		Animal b=new Dog();//Animal reference and Dog object
		Dog c=new Dog();//Dog reference and Dog object
		
		a.move();
		b.move();//b is of Animal Type but runs method from Dog class because in runtime object type is figured out by JVM and would run method based on it. while in compile time reference type is checked
		c.move();
		
		//b.bark();//gives a compilation error since b is of Animal reference type and Animal method does not have bark method. In compile time ref. type is checked
		c.bark();
	}
}
