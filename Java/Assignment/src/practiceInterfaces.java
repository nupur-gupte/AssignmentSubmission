interface LandAnimals {
	void walk();
	void eat();
}
interface WaterAnimals {
	void swim();
	void eat();
}
class Amphibians implements LandAnimals, WaterAnimals {//multiple inheritance possible through interfaces
	public void walk() {
		System.out.println("I can walk on land");
	}
	public void swim() {
		System.out.println("I can swim in water");
	}
	public void eat() {
		System.out.println("I eat");
	}
}
public class practiceInterfaces {
	public static void main(String args[]) {
		Amphibians a = new Amphibians();
		a.walk();
		a.swim();
		a.eat();
	}
}
