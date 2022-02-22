class Calculator
{
	public static int add(int a, int b)
	{
		return a+b;
	}
	
	public static int sub(int a, int b)
	{
		return a-b;
	}
}
public class CalcMain
{
	public static void main(String[] args)
	{
	  Calculator cal ;
    	  System.out.println(cal.add(2,3));
	  System.out.println(cal.sub(6,2));
	}
}