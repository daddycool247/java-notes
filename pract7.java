/*1) a) Create a class “Vehicle” with a method “start()” that prints “Vehicle
started”.
b) Create a subclass “Car” that extends “Vehicle” and overrides the “start()”
method to print “Car started”.
c) Create an object of the “Vehicle” class and call the “start()” method.
d) Create an object of the “Car” class and call the “start()” method.

import java.util.*;
class vehicle
{
	void starts()
	{
		System.out.println("Vehicle started");
	}
}
class car extends vehicle
{
	void starts()
	{
		System.out.println("Car started");
	}
}
class pract7
{
	public static void main(String args[])
	{
		vehicle v1=new vehicle();
		car c1=new car();
		v1.starts();
		c1.starts();
	}
}

Output
C:\Aman24\java>javac pract7.java

C:\Aman24\java>java pract7
Vehicle started
Car started

2) a) Create a class “Person” with fields “name” and “age” and a method “display()” 
that prints the name and age of the person. b) Create a subclass “Employee” that 
extends “Person” and adds a field        
“salary” and a method “display()” that prints the name, age, and salary of    
the employee. c) Create an object of the “Person” class and call the “display()” 
method. d) Create an object of the `Employee` class and call the “display()” method

import java.util.*;
class person
{
	String name;int age;
	void display()
	{
		System.out.println("The name of the person is "+name+" and the age is "+age);
	}
	person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class employee extends person 
{
	int salary;
	employee(String n,int a,int sal)
	{
		super(n,a);
		salary=sal;
	}
	void display()
	{
		System.out.println("the name is "+name+"and the age is "+age+" and the salary is "+salary);
	}
}
class pract7
{
	public static void main(String args[])
	{
		person p1=new person("Aman",18);
		employee e1=new employee("Tara",20,5000000);
		p1.display();
		e1.display();
	}
}

Output
C:\Aman24\java>javac pract7.java

C:\Aman24\java>java pract7
The name of the person is Aman and the age is 18
the name is Taraand the age is 20 and the salary is 5000000

Q.3) a) Create a class “Animal” with a method “makeSound()” that prints a sound. 
b) Create a subclass “Dog” that extends “Animal” and overrides the “makeSound()” method to print “Woof!”. 
c) Create an object of the “Animal” class and call the “makeSound()” method. 
d) Create an object of the “Dog” class and call the “makeSound()” method.*/	

import java.util.*;
class Animal 
{
	void makesound()
	{
		Systme.out.println("bark
