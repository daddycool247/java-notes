import java.util.*;
class reverseloop 
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		for (int i=a;i>=1;i--)
		{
			System.out.print(i+" ");
		}
	}
}


OUTPUT
Enter a number
10
10 9 8 7 6 5 4 3 2 1