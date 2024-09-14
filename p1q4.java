import java.util.*;
class p1q4
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st integer:- ");
		float a=sc.nextFloat();
		System.out.println("Enter the 2nd integer:- ");
		float b=sc.nextFloat();
		if(a>b)
		{	
		System.out.println(a+ "is greater than" +b);
		}
		else
		{
		System.out.println(b+ "is greater than" +a);
		}
	}
}