import java.util.*;
class demoCond
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year : ");
		int y=sc.nextInt();
		String x=(y%4==0)?"leap year":"Not a leap year";
		System.out.println(x);
	}
}