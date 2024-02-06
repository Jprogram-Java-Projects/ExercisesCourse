package fundamentals;

import java.util.Scanner;

/**
 * Program to calculate IMC (BMI)
 * 
 * Author: Jefferson Silva
 * Date : 06/02/2024
 * Last modified: 06/02/2024 
 * 
 */

public class IMC {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the height in meters: ");
		double height = input.nextDouble();
		
		System.out.print("Enter the weight in kilograms: ");
		double weight = input.nextDouble();
		
		System.out.println("IMC = "+ weight / (height * height));
		
		input.close();
	}
}
