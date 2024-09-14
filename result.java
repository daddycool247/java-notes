import java.util.*;
class result
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks obtained in Maths:");
		int a=sc.nextInt();
		System.out.println("Enter the marks obtained in English:");
		int b=sc.nextInt();
		System.out.println("Enter the marks obtained in Science:");
		int c=sc.nextInt();
		System.out.println("The total marks obtained is: "+(a+b+c));
		System.out.println("The aggregate marks obtained is: "+((a+b+c)/3));
	}
}