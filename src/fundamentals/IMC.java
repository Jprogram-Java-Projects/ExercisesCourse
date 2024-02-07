package fundamentals;

//import java.util.Locale;
import java.util.Scanner;

/**
 * Program to calculate IMC (BMI)
 * 
 * Author: Jefferson Silva
 * Date : 06/02/2024
 * Last modified: 06/02/2024 
 * 
 * Modifications:
 * 
 *  - v1.1.0 : Created program
 * 
 */

public class IMC {
	
	public static void main(String[] args) {
		
		// The decimal can be represented by a point or a comma depending on your location:
		// Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the height in meters: ");
		double height = input.nextDouble();
		
		System.out.print("Enter the weight in kilograms: ");
		double weight = input.nextDouble();
		
		System.out.println("IMC = "+ weight / (height * height));
		
		input.close();
	}
}
