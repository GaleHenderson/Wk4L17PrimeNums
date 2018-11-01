package PrimeNums;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
	
	public static String matchRegex(Scanner scan, String prompt, String regex) {
		boolean isValid = false;
		String input;
		do { 
			input = getString(scan, prompt);
			if (input.matches(regex)) {
				isValid = true;
			}else {
				System.out.println("Input must match correct format:");
				isValid = false;
			}
		}while (!isValid);
	return input;
	}
	
	
	public static String getString(Scanner scan, String prompt) {
		System.out.print(prompt);
		String s = scan.next(); // read user entry
		scan.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static int getInt(Scanner scan, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (scan.hasNextInt()) {
				i = scan.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			scan.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(Scanner scan, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(scan, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}

	public static double getDouble(Scanner scan, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (scan.hasNextDouble()) {
				d = scan.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			scan.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(Scanner scan, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(scan, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
		

	}
	
	
	

}