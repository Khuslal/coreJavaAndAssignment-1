package oddevenidentifier;

import java.util.Scanner;

public class OddEvenIdentifier {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the number to check odd/even : ");
		int num = scn.nextInt();
		if(num%2 == 0) {
			System.out.println(num+" = Even Number");
		}else {
			System.out.println(num+" = Odd Number");
		}
		scn.close();
	}
}
