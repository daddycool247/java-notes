public class explicit
{
	public static void main(String[] args)
	{
		double a = 100.245;
		//Narrowing Type Casting
		short b = (short)a;
		int c= (int)a;
		System.out.println("Before Casting Original Value" + a);
		System.out.println("After Casting to short" + b);
		System.out.println("After casting to int" + c);
	}
}