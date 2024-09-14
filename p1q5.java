 
		System.out.println("Enter the 1st integer:- ");
		float a=sc.nextFloat();
		System.out.println("Enter the 2nd integer:- ");
		float b=sc.nextFloat();
		System.out.println("Enter the 3rd integer:- ");
		float c=sc.nextFloat();
		if(a>b&&a>c)
		{	
		System.out.println(a+ "is greater than" +b+ "and" +c);
		}
		else if(b>a&&b>c)
		{
		System.out.println(b+ "is greater than" +a+ "and" +c);
		}
		else
		{
		System.out.println(c+ "is greater than" +a+ "and" +b);
		}
	}
}