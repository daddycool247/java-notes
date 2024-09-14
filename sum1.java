// for loop problem
import java.util.*;
class sum1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of integer: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
		sum=sum+i*i;
		}
		System.out.println("The Sum = "+sum);
	}
}