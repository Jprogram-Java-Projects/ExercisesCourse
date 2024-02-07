package fundamentals;

//import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Create a program that reads the temperature in Fahrenheit and converts to Celsius 
 * OR 
 * that reads the temperature in Celsius and converts to Fahrenheit.
 * 
 * 
 * Author: Jefferson Silva
 * Date : 06/02/2024
 * Last modified: 07/02/2024
 * 
 * Modifications:
 * 
 *  - v1.1.0 : Created program
 *  - v1.1.0 : Test location in Scanner
 * 
 */

public class Temperature {
	
	private static double convertFXC(double f) {
		return (f - 32) * 5/9;
	}
	
	private static double convertCXF(int c) {
		return c * 9/5 + 32;
	}
	
	public static void main(String[] args) {
		
		// The decimal can be represented by a point or a comma depending on your location:
		// Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Choose one of the options below: \n\n"
							+ "1 - Convert Fahrenheit to Celsius \n"
							+ "2 - Convert Celsius to Fahrenheit \n"
							+ "0 - Exit \n\n"
							+ "Option: ");
		
		//System.out.println(input.hasNextInt());
		int option = input.nextInt(); 
		
		switch (option) {
			case 0:
				break;
				
			case 1:
				System.out.print("Fahrenheit to Celsius (°F to °C): ");
				double fahrenheit = input.nextDouble();
				System.out.println(convertFXC(fahrenheit));
				break;
				
			case 2:
				System.out.print("Celsius to Fahrenheit (°C to °F): ");
				int celsius = input.nextInt();
				System.out.println(convertCXF(celsius));
				break;

			
			default:
				input.close();
				throw new IllegalArgumentException("Unexpected value: " + option);
		}
		
		input.close();
	}

}
