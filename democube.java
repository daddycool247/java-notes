import java.util.*;
class cube 
{
	int l;
	void surface()
	{
		int sa = 6*l*l;
		System.out.println("The surface area "+sa);
	}
	void display()
	{
		System.out.println("The length = "+l);
	}
}
class cuboid extends cube
{
	int b,h;
	void volume()
	{
		int v = l*b*h;
		System.out.println("The volume = " +v);
	}
}
class democube
{
	public static void main(String args[])
	{
		cuboid c1 = new cuboid();
		c1.b=2;c1.h=5;c1.l=3;
		c1.surface();
		c1.display();
		c1.volume();
	}
}