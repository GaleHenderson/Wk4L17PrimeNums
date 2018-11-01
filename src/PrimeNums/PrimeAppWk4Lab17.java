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

userChoice = Validator.getInt(scan, "Which sequenced prime number would you like to locate?");

			
			for (int i = 1; i <= 100;) {
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						status = 0;
						break;
					}
				}
				if (status != 0) {
					System.out.println(num);
					i++;
					primeNums.add(num);
				}
				status = 1;
				num++;
			
			}
			System.out.println(primeNums);

		}

//	public static boolean isPrime(int n) {
//		if (n % 2 == 0)
//			return false;
//		for (int i = 3; i * i <= n; i += 2) {
//			if (n % i == 0)
//				return false;
//		}
//		return true;
//	}

//	public static int sequencer(int num) {
//		int sequenceNum = 0;
//		int counter = 1;
//		if (isPrime(num)== true)
//		for (int i = 2; i >= 2; i++) {
//			System.out.println("The number" + counter++ + "prime number is " + );
//		}
//		
//		return sequenceNum;
//	}

}
