package looping;

public class ForTest {
	public static void main(String[] args) {

		//================Even number=============================
//		int x = 0;
//		for (int i = 1; i <= 100; i++) {
//
//			if (i % 2 == 0) { // System.out.println(i); // SUM of Even number
//				x += i;
//			}
//		}
//		System.out.println("The sum of even from 1-100 : "+x);

		
		//================Odd Number Method 1:===============================
//		int n = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//				n += i;
//			}
//		}
//		Sum of odd number and even no.
//		System.out.println("The sum of odd from 1-100 : "+n);

		//=================Odd Number Method 2:=================================
//		for (int i = 1; i <= 100; i += 2) {
//			// sum of odd number and even no.
//
//			// Odd number
//			System.out.println(i);
//		}
		
		//==============Sum of all Numbers from 1 to 100====================
		int x=0;
		for(int i = 0; i<=100; i++) {
			x += i;
		}
		System.out.println("The sum of 1-100 : "+x);
	}
}
