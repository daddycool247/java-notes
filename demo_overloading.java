/* Create a class called rect with two instance variable of integer type. Craete a method
name area without any parameter, with one parameter, with two parameter which calculate
area of rectangle. In method area without parameter calculate the area using instance variable
write a constructor to initialize instance variable. Create a class with main method with
3 object of class rect and using these object envoke method area.*/
import java.util.*;
class rect
{
	int a,b;
	rect()
	{}
	rect(int length,int width)
	{
		a=length;b=width;
	}
	int area()
	{
		return a*b;
	}
	int area(int side)
	{
		return side*side;
	}
	int area(int length, int width)
	{
		return length*width;
	}
	
}
class demo_overloading
{
	public static void main(String args[])
	{
		rect r1 = new rect(5,6);
		rect r2 = new rect();
		rect r3 = new rect();
		System.out.println(r1.area());
		System.out.println(r2.area(5));
		System.out.println(r3.area(10,6));
	}
}