package array;

import java.util.Scanner;

public class StoreAndPrintPriceOfBooks {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String subjects[] = { "Maths", "Economics", "Science", "Social", "Moral", "English", "Computer", "Account",
				"EHP", "Occupation" };
		int price[] = new int[subjects.length];
		int total = 0;
		for (int i = 0; i < subjects.length; i++) {
			System.out.println("Enter the price of " + subjects[i] + " : ");
			price[i] = scn.nextInt(); // declared int price [] = new int [subject.length]; to use here.
			total += price[i];
		}
		int avg = total/10;
		System.out.println("Total Price of all 10 books : " + total);
		System.out.println("Average Price of all 10 books : " + avg);
		scn.close();
	}
}
