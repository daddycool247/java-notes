import java.util.*;
class p1q7
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int x=sc.nextInt();

		if(x%5==0 && x%11==0)
		{
			System.out.println(x +" is divisible by 5 and 11");
		}
		else
		{
			System.out.println(x +" is not divisible by 5 and 11");
		}
	}
}