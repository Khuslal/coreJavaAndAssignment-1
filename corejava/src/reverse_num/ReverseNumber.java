package reverse_num;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int x = scn.nextInt();
		scn.close();

		int temp = x;
		int count = 0;

		while (temp % 10 != 0) {
			count++;
			temp /= 10;
		}
		System.out.println("The count of " + x + " : " + count);

		for (int i = 0; i < count; i++) {
			int y = x % 10;
			System.out.println(y);
			x /= 10;
		}
	}
}
