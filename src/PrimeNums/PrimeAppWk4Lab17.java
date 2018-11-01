package PrimeNums;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeAppWk4Lab17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int userChoice;
		int counter = 0;
		int n;
		int status = 1;
		int num = 2;
		ArrayList<Integer> primeNums = new ArrayList<>();
		String userCont = "y";

		System.out.println("Whelcome to the Prime Finder! Let's find one of the first 100 prime numbers.");
		while(userCont.equalsIgnoreCase("y")) {
userChoice = Validator.getInt(scan, "Which sequenced prime number would you like to locate?", 1,100);

			
			for (int i = 1; i <= 100;) {
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						status = 0;
						break;
					}
				}
				if (status != 0) {

					i++;
					primeNums.add(num);
				}
				status = 1;
				num++;
			}
			System.out.println("The number " + userChoice + " prime number is " + primeNums.get(userChoice-1) + ".");
			userCont = Validator.getString(scan, "Would you like to continue finding the first 100 prime numbers?");
		}
		System.out.println("Goodbye!");
		}
	


}
