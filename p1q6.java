import java.util.*;
class p1q6
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		float a=sc.nextFloat();
		if(a>0)
		{
			System.out.println("It is a positive number");
		}
		else if(a<0)
		{
			System.out.println("It is a negetive number");
		}
		else
		{
			System.out.println("The number is Zero");
		}		
	}
} 