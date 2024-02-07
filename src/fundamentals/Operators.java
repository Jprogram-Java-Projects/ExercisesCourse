package fundamentals;

//import java.util.Locale;
import java.util.Scanner;

/**
 * Create a program that reads a value and presents the results squared and cubed of the value.
 * 
 * Author: Jefferson Silva
 * Date : 07/02/2024
 * Last modified: 07/02/2024 
 *
 * Modifications:
 * 
 *  - v1.1.0 : Created program
 *  
 */

public class Operators {
	
	private static double calculateSquared(double n) {
		// return n * n;
		return Math.pow(n, 2);
	}
	
	private static double calculateCubed(double n){
		// return n * n * n;
		return Math.pow(n, 3);
	}

	public static void main(String[] args) {
		
		// The decimal can be represented by a point or a comma depending on your location:
		// Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double number = input.nextDouble();
		
		System.out.printf("%.2f² = %.2f", number, calculateSquared(number));
		System.out.println();
		System.out.printf("%.2f³ = %.2f", number, calculateCubed(number));
		
		input.close();
	}
}
