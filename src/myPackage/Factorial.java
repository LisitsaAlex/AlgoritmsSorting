package myPackage;

public class Factorial {
	
	
	
	public int calculate(int a)
	{
		if (a==1) return 1;
		
		return a*calculate(a-1);
		
	}
	
	public float eiler(float a)
	{
		if (a==1) return 1;
		return a/(a+eiler(a-1));
		
	}
	
	public int fibonachi(int a)
	{
		if (a==1) return 1;
		if (a==0) return 0;
		return fibonachi(a-1)+fibonachi(a-2);
	}
	
}
