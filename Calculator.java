import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x= ");
		int x=sc.nextInt();
		System.out.println("Enter the value of y= ");
		int y=sc.nextInt();
		System.out.println("Enter an Operator");
		char op=sc.next().charAt(0);

		switch(op)
		{
			case '+':
			System.out.println(x+y);
			break;

			case '-':
			System.out.println(x-y);
			break;

			case '/':
			System.out.println(x/y);
			break;

			case '*':
			System.out.println(x*y);
			break;
			
			default:
			System.out.println("Any other Operation.");
		}
	}
}
