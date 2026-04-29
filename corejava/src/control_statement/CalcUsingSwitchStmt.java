package control_statement;

import java.util.Scanner;

public class CalcUsingSwitchStmt {
	public static void main(String[] args) {
//		 *  Q2> WAP to calculate +,-,*,/ of two int values using switch.
//		 *  
//		 *    char op = sc.next().chatAt(0);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		int a = scn.nextInt();
		System.out.println("Select operator '+,-,*,/ : ");
		char op = scn.next().charAt(0);
		System.out.println("Enter the value of B: ");
		int b = scn.nextInt();
		
		switch (op) {
			case '+':
				int add = a+b;
				System.out.println("The sum is :"+add);
				break;
			case '-':
				int sub = a-b;
				System.out.println("The sub is :"+sub);
				break;
			case '*':
				int mul = a*b;
				System.out.println("The mul is :"+mul);
				break;
			case '/':
				int div = a/b;
				System.out.println("The div is :"+div);
				break;
			default:
				System.out.println("Invalid Operator Selected!");
		}
	}
}
