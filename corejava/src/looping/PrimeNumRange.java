package looping;

import java.util.Scanner;

public class PrimeNumRange {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. to check whether it is prime : ");
		int num = scn.nextInt();
		int total_num = 0;
		do {
		int count = 0;
		for (int div = 2; div*div <= num; div++) {
			if (num % div == 0) {
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println(num);
			total_num ++;
		} 
		num--;
		}while(num>1);
		System.out.println("Total number : "+total_num);
	}
}
