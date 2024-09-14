import java.util.*;
class Vehicle
{
	int speedlimit = 90;
}
class Car extends Vehicle
{
	
}
class finaldemo
{
	public static void main(String args[])
	{
		Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		System.out.println(v1.speedlimit);
		System.out.println(c1.speedlimit);
					
	}
} 