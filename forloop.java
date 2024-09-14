import java.util.*;
class forloop 
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		for (int i=1;i<=a;i++)
		{
			System.out.print(i+" ");
		}
	}
}


OUTPUT
Enter a number
10
1 2 3 4 5 6 7 8 9 10