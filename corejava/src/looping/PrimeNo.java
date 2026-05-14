package looping;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. to check whether it is prime : ");
		int num = scn.nextInt();
		scn.close();

		int count = 0;
		for (int div = 2; div * div <= num; div++) {
			if (num % div == 0) {
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println(num + " is prime.");
		} else {
			System.out.println(num + " is not prime.");
		}
	}
}
