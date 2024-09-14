import java.util.*;
class Vehicle
{
	final void start()
	{
		System.out.println("vehicle started");
	}
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("car has started");
	}

}
class finaldemo2
{
	public static void main(String args[])
	{
		Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		v1.start();
		c1.start();
					
	}
} 