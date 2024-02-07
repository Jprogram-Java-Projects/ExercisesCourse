package fundamentals;

import java.util.Scanner;

/**
 * Create a program that reads the value of the base and height of a triangle and calculates the area.
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

public class Geometry {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the height of the triangle: ");
		int height = input.nextInt();
		
		System.out.print("Enter the value of the base of the triangle: ");
		int base = input.nextInt();
		
		System.out.println( "Area = " + (base * height)/2 );
		
		input.close();
	}
}
