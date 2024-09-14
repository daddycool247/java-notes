import java.util.*;
class tables
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
} 


