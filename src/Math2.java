public class Math2 
{
	private double a;
	private double b;
	
	public static double add(double a, double b)
	{
		return (a + b);
	}
	
	public static double sub(double a, double b)
	{
		return a - b;
	}
	
	public static double mult(double a, double b)
	{
		return a * b;
	}
	
	public static double div(double a, double b)
	{
		return a / b;
	}
	
	public static double pow(double a, double b)
	{
		if (b > 1)
		{
			for(int i = 0; i < b; i++)
			{
				a *= a;
			}
		}
	
		return a;
	}
	
}
