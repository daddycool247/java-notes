import java.util.*;
class demointe
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer value x =");
		int x=sc.nextInt();
		System.out.println("Enter an integer value y =");
		int y=sc.nextInt();
		System.out.println(++x);
		System.out.println(++y);
		System.out.println(y++);
	}
}