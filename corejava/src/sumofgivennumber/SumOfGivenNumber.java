package sumofgivennumber;

import java.util.Scanner;

public class SumOfGivenNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter initail value :");
		int num1 = scn.nextInt();
		
		System.out.println("Enter final value :");
		int num2 = scn.nextInt();
		int max = 0;
		int min = 0;
		if(num1 < num2) {
			max = num2;
			min = num1;
			
		}else {
			max = num1;
			min = num2;
		}
		int sum = 0;
		for(int i = min; i<=max; i++) {
			sum += i;
		}
		System.out.println("The sum of numbers from "+num1+" to "+num2+" : "+sum);
	}
}
