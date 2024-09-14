import java.util.*;
class p1q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first side =");
		int a=sc.nextInt();
		System.out.println("Enter the second side =");
		int b=sc.nextInt();
		System.out.println("Enter the third side =");
		int c=sc.nextInt();
		if(a+b>c||a+c>c||b+c>a);
		{	
			if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a)
		{
		System.out.println("The triangle is right angled triangle");
		}
		else if (a*a+b*b>c*c||a*a+c*c>b*b||b*b+c*c>a*a)
		{
		System.out.println("The triangle is an obtuse angled triangle");
		}
		else
		{
		System.out.println("The triangle is an acute angled triangle");
		}
		}
	}	
}