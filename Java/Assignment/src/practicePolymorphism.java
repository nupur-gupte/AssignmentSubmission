class Vehicle {
	int speed=50;
	void run()
	{
		System.out.println("Vehicle running at speed of "+speed+" kmph");
	}
}
class Car extends Vehicle{
	int speed=80;
	void run()
	{
		System.out.println("Car running at speed of "+speed+" kmph");
	}
}

class SportsCar extends Car{
	int speed=130;
}
public class practicePolymorphism {
	public static void main(String args[])
	{
		Vehicle v1=new Car();
		v1.run();
		System.out.println("Speed of v1 = "+v1.speed);//variables noy overridden
		Vehicle v2=new SportsCar();
		v2.run();//no method run in SportsCar class, so it calls the method of parent class
		System.out.println("Speed of v2 = "+v2.speed);
	}

}
