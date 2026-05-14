package sumof1tonthnaturalnumber;

import java.util.Scanner;

public class SumOfOneTonthNaturalNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number whose sum you want to calculate from 1:");
		int n = scn.nextInt();
		scn.close();

		int count = 0;
		for (int i = 1; i <= n; i++) {
			count += i;
		}
		System.out.println(count);
	}
}
