/*1. Create a java

class firstp4q1
{
	int a; String x;
	void disp(int x, String a)
	{
		System.out.println("My roll no is "+x+" and name is "+a);
	}
}
class secp4q1
{
	int x; float y;
}
class thirdp4q1
{
	int sum1(int x, int y)
	{ 
		return x+y;
	}
}
class pract4
{
	public static void main(String args[])
	{
		firstp4q1 f1 = new firstp4q1();
		secp4q1 s1 = new secp4q1();
		thirdp4q1 t1 = new thirdp4q1();
		f1.a=401;f1.x="Aman";
		f1.disp(f1.a,f1.x);
		s1.x=45;s1.y=34.5f;
		System.out.println("The value of x "+s1.x+" value of y "+s1.y);
		System.out.println("The sum is "+t1.sum1(12,45));
	}
}

Output

C:\Aman24\java>javac pract4.java

C:\Aman24\java>java pract4
My roll no is 401 and name is Aman
The value of x 45 value of y 34.5
The sum is 57          */

/*2. Write a Java program to create a class called Swap with methods 
import java.util.*;
class swap
{
	int x, y;
	void disp(int x, int y)
	{
		System.out.println("The original value of x is "+x+" and y is "+y);
	}
	void inter(int a,int b)
	{
		int c;
		c=a; a=b; b=c;
		System.out.println("The interchanged value of x is "+x+" and y is "+y);
	}
}
class pract4
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		swap s=new swap();
		System.out.println("Enter the value of x : ");
		s.x=sc.nextInt();
		System.out.println("Enter the value of y : ");
		s.y=sc.nextInt();
		s.disp(s.x,s.y);
		s.inter(s.x,s.y);
	}
}

Output
C:\Aman24\java>javac pract4.java

C:\Aman24\java>java pract4
Enter the value of x :
5
Enter the value of y :
6
The original value of x is 5 and y is 6
The interchanged value of x is 5 and y is 6 
*/
/* 3. Define classes:
a. Complete_1 containing instance variables 𝑎 and 𝑏 of String and byte type.
b. Complete_2 containing a power( ) method to find the square and cube of int
type number, add( ) method to find the sum of two int numbers.
c. Class Complete_3 containing instance variables x and y of int type, display( )
method to display x and y and sub( ) method to take difference of x and y.
d. Class CompleteDemo containing main() that creates an object of these classes,
which will invoke the methods. 

import java.util.*;
class complete_1
{ 
	String a; byte b;
}
class complete_2
{
	int x,y;
	void power(int x,int y)
	{
		System.out.println("The square of "+x+" is "+(x*x));
		System.out.println("The cube of "+x+" is "+(x*x*x));
		System.out.println("The sum of "+x+" and "+y+" is "+(x+y));
	}
}
class complete_3
{
	int x,y;
	void disp(int a, int b)
	{
		System.out.println("The values are "+a+" and "+b);
	}
	int sub(int a, int b)
	{
		return a-b;
	}
}
class pract4
{
	public static void main(String args[])
	{
	complete_1 c1 = new complete_1();
	complete_2 c2 = new complete_2();
	complete_3 c3 = new complete_3();
	Scanner sc= new Scanner(System.in);
	c1.a = "Aman"; c1.b=45;
	System.out.println("The values are "+c1.a+" and "+c1.b);
	System.out.println("Enter the value of x: ");
	c2.x = sc.nextInt();
	System.out.println("Enter th value of y: ");
	c2.y = sc.nextInt();
	c2.power(c2.x,c2.y);
	c3.x=6;c3.y=-10;
	c3.disp(c3.x,c3.y);
	System.out.println("The difference is: "+(c3.x-c3.y));
	}
}

Output
C:\Aman24\java>javac pract4.java

C:\Aman24\java>java pract4
The values are Aman and 45
Enter the value of x:
6
Enter th value of y:
7
The square of 6 is 36
The cube of 6 is 216
The sum of 6 and 7 is 13
The values are 6 and -10
The difference is: 16*/

/*5. Write a Java program to create a class called Quad containing 𝑎, 𝑏 and 𝑐 as variables,
denoting the coefficient of a quadratic equation. The class contains instance variables
to initialize these variables and a method that finds whether the quadratic equation for
an instance of the class has real roots or complex roots. Create a class Quadratic
containing the main() method. Make an instance (object) of the above class to find the
nature of the roots and display proper messages."

import java.util.*;
class quad
{
	int a,b,c;
	quad (int x,int y,int z)
	{ 
		a=x;b=y;c=z;
	}
	String nature_root()
	{
		if(b*b-4*a*c==0)
		{
			return "Roots are real and equal";
		}
		else if(b*b-4*a*c>0)
		{
			return "Roots are real and distinct";
		}
		else
		{
			return "Roots are complex";
		}
	}
}
class pract4
{
	public static void main(String args[])
	{
		quad q1 = new quad(1,-5,6);
		quad q2 = new quad(1,-4,4);
		quad q3 = new quad(1,1,1);
		System.out.println(q1.nature_root());
		System.out.println(q2.nature_root());
		System.out.println(q3.nature_root());
	}
}
	
Output 
C:\Aman24\java>javac pract4.java

C:\Aman24\java>java pract4
Roots are real and distinct
Roots are real and equal
Roots are complex */