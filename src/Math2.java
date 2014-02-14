/**
 * This is the main class for the calculator project.
 * It contains methods for the basic functions.
 * 
 * @author jforema4
 * @author more soon
 */

public class Math2 
{
	private double a;
	private double b;
	
	/**
	 * Simple addition;
	 * @param a First double to add.
	 * @param b Second double to add.
	 * @return The added doubles.
	 */
	public static double add(double a, double b)
	{
		return a + b;
	}
	
	/**
	 * Simple subtraction.
	 * @param a The double to subtract from
	 * @param b The double subtracted from a
	 * @return The result of the subtraction
	 */
	public static double sub(double a, double b)
	{
		return a - b;
	}
	
	/**
	 * Simple multiplication method.
	 * @param a The first double to multiply
	 * @param b The double to multiply by the first
	 * @return The result of the multiplication
	 */
	public static double mult(double a, double b)
	{
		return a * b;
	}
	
	/**
	 * Simple division method.
	 * @param a The denominator
	 * @param b The numerator
	 * @return The quotient.
	 */
	public static double div(double a, double b)
	{
		return a / b;
	}
	
	/**
	 * 
	 * @param a The number to raise to a power.
	 * @param b The power to raise the number to.
	 * @return The number raised to the power
	 */
	public static double pow(double a, double b)
	{
		if (b > 1)
		{
			for(int i = 0; i < b; i++)
				a *= a;
		}
	/*	else if (0 < b && b < 1)
			a = nrt(a, b);
		else if (b == 0)
			a = 1;
		else if (-1 < b && b < 0):
			a = a / nrt(a, b);
		else if (b < -1)
		{
			for(int i = 0; i < b; i++)
			{
				a *= a;
			}
			a = 1 / a;
		}
	*/

		return a;
 	}
	
		
/*	public static double nrt(double a, double b)
	{
		if (b > 1)
		{
			for(int i = 0; i < b; i++)
				a /= a;
		}
		if (0 < b && b < 0)
*/			
	
}
