package tableofgivennumber;

import java.util.Scanner;

public class TableOfGivenNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. to print its table: ");
		int num = scn.nextInt();
		int table;
		// Table of Given Number:
		for(int i=1; i<=10; i++) {
			table = num*i;
			// using if statement helps to prints the below line only once.
			if(i == 1) {
				System.out.println("Table Of "+num+" : \n");
			}
			// print the table of given number upto the above iteration
			System.out.println(num+" * "+i+" = "+table);
		}
		scn.close();
	}
}
