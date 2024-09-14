import java.util.*;
class sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of integer: ");
		int n=sc.nextInt();
		int i=1,sum=0;
		while(i<=n)
		{
		sum=sum+i*i;
		i++;
		}
		System.out.println("The Sum = "+sum);
	}
}