/*1. Write Java program to define following classes:
a. Define Car as class with instance variables color and body initialize to blue and
wagon.
b. Define Car() as a default constructor and another constructor with parameters
color and body.
c. Display() is a method that display the color and body except for blue color
otherwise display car is blue.
d. Define CarDemo that contains main() method. Create an instance of Car class
with color red and body as water tank.

import java.util.*;
class car
{	
	String color="blue";String body="wagon";
 	car()
	{}
	car(String color,String body)
	{
		this.color=color;
		this.body=body;
	}
	void display()
	{
		System.out.println("The color fo car" +color+ "The body of car" +body);
	}
}
class pract5
{
	public static void main(String args[])
	{
		car c1=new car();
		car c2=new car("Red","Water tank");
		c1.display();
		c2.display();
	}
}
Output
C:\Aman24\java>javac pract5.java

C:\Aman24\java>java pract5
The color fo carblueThe body of carwagon
The color fo carRedThe body of carWater tank*/

/*2. Write a Java program containing following classes:
a. Class Marks containing marks in two papers of a subject. Use parameterized
constructor to initialize the values.
b. Class Marks1 defines an object of the above class and pass the parameters of
your choice. Define an instance variable name of the student. Write a method to
find the average of two papers and a method to display name of the subject,
marks in two papers and an average mark of the student.
c. Class MarksDemo contains main() method to invoke the members of class
Marks1.

import java.util.*;
class marks
{	
	int sub1;int sub2;
	marks(int sub1,int sub2)
	{
		this.sub1=sub1;
		this.sub2=sub2;
	}
}
class marks1
{
	marks m1=new marks(35,39);
	String name;
	double avg()
	{
		return((m1.sub1+m1.sub2)/2);
	}
	void display()
	{
		System.out.println("The name of the student is : "+name);
		System.out.println("Marks in first subject: " +m1.sub1+ ".Marks in second subject :"+ m1.sub2);
		System.out.println("The average marks "+avg());
	}
}
class pract5
{
	public static void main(String args[])
	{
		marks1 m2= new marks1();
		m2.name= "Aman";
		m2.avg();
		m2.display();
	}
}	
	
Output 
C:\Aman24\java>javac pract5.java

C:\Aman24\java>java pract5
The name of the student is : Aman
Marks in first subject: 35.Marks in second subject :39
The average marks 37.0*/


		
	