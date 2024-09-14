import java.util.*;
class rect
{ 
	int l,w;
	int area(int x, int y)
	{
		return x*y;
	}
	int peri(int p, int q)
	{
		return 2*(p+q);
	}
}
class rectdemo
{
	public static void main(String args[])
	{
		rect O1=new rect();
		rect O2=new rect();
		O1.l=5;
		O1.w=6;
	System.out.println("Area= "+O1.area(O1.l,O1.w));
	System.out.println("Perimeter= "+O1.peri(O1.l,O1.w));
	}
}	
		