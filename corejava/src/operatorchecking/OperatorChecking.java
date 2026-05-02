package operatorchecking;

import java.util.Scanner;

public class OperatorChecking {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = scn.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = scn.nextInt();
		if(num1 == num2) {
			System.out.println(num1+ " = "+num2);
		}else if(num1 > num2) {
			System.out.println(num1+" > "+num2);
		}else if(num1 < num2) {
			System.out.println(num1+" < "+num2);
		}
		scn.close();
	}
}
