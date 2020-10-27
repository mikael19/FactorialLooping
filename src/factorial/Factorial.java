/**
 * 
 */
package factorial;

/**
 * @author mikael
 *
 */
public class Factorial {
	public static double factorial(Integer n) {
		double result = 1;
		for(Integer i = n; i > 0; i--) {
			System.out.println(i);
			result *= i;
		}
		return result;
	}
}
