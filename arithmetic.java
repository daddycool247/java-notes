import java.util.*;
class arithmetic
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd integer:");
		int b=sc.nextInt();
		System.out.println("The sum is: "+(a+b));
		System.out.println("The difference is: "+(a-b));
		System.out.println("The product is: "+(a*b));
		System.out.println("The division is: "+(a/b));
	}
}