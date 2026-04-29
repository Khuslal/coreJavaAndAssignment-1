package control_statement;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the number: ");
		double n = scn.nextDouble();
		
		if(n%2 == 0) {
			System.out.println("The no. "+n+" is even.");
		}else {
			System.out.println("The no. "+n+" is odd.");
		}
	}
}
