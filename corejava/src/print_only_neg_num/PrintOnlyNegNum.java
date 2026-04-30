package print_only_neg_num;

import java.util.Scanner;

public class PrintOnlyNegNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the number to display if negative: ");
		double num = scn.nextDouble();
		if(num<0) {
			System.out.println("The number "+num+" is negative.");
		}
	}
}
