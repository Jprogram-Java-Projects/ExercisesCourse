package fundamentals;

import java.util.Scanner;

/**
 * Create a program that solves quadratic equations (ax2 + bx + c = 0) using Bhaskara's formula. 
 * Use as an example a = 1, b = 12 and c = -13. Find the delta
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

public class Algebra {
	
	private static int getDelta(int a, int b, int c) {
		return (b * b) - (4 * a * c);
	}
	
	private static double getX1(int a, int b, int delta) {
		return (-b + Math.sqrt(delta)) / (2 * a);
	}
	
	private static double getX2(int a, int b, int delta) {
		return (-b - Math.sqrt(delta)) / (2 * a);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Equation: ax² + bx + c = 0 \n");
		
		System.out.print("* Enter the value of a: ");
		int a = input.nextInt();

		System.out.print("\n* Enter the value of b: ");
		int b = input.nextInt();

		System.out.print("\n* Enter the value of c: ");
		int c = input.nextInt();

		int delta = getDelta(a, b, c);

		System.out.printf("\nYour equation is: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("\nThe delta is: " + delta);

		double x1 = getX1(a, b, delta);

		System.out.printf("\nThe x1 of the equation is: %.2f", x1);

		double x2 = getX2(a, b, delta);

		System.out.printf("\nThe x2 of the equation is: %.2f" ,x2);
		
		input.close();
		
	}
}
