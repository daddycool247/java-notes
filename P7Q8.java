import java.util.*;
class Vehicle
{
	void start()
	{
		System.out.println("Vehicle started");
	}
}
class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Car driving");
	}
}
class Sportscar extends Vehicle
{
	void drive()
	{
		System.out.println("Sportscar driving fast");
	}
}
class P7Q8
{
	public static void main(String args[])
	{
		Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		Sportscar s1 = new Sportscar();
		v1.start();
		c1.start();
		c1.drive();
		s1.start();
		s1.drive();
}
} 