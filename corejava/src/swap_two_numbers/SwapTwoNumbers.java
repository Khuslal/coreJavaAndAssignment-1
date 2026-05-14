package swap_two_numbers;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("A = ");
		int a = scn.nextInt();
		System.out.println("B = ");
		int b = scn.nextInt();
		scn.close();

//		================= a.Using Temp To Store Value======================
//		int temp = a;
//		a=b;
//		b = temp;
//		System.out.println("A = "+a+" B = "+b);
//		
//		================= b. Without Using Temp To Store Value==============

		a = a + b; // a = 4+3; i.e = 7;
		b = a - b; // b= 7-3; i.e = 4; //now b = a (original value of a);
		a = a - b; // a= 7-4; i.e. = 3; // now a = b (original value of b);
		System.out.println("The swapped value of A = " + a + " & B = " + b);
	}
}