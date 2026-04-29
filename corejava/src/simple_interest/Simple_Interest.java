package simple_interest;

import java.util.Scanner;

public class Simple_Interest {
 public static void main(String[] args) {
	 
	int principal, time ,rate;
	
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter Principal: ");
	principal = scn.nextInt();
	
	System.out.print("Enter Time: ");
	time = scn.nextInt();
	
	System.out.print("Enter Rate: ");
	rate = scn.nextInt();
	
	int si = (principal*time*rate)/100;
	
	System.out.println("The Simple Interest for the given input is: "+si);
}
}
