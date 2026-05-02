package looping;

public class ForTest {
	public static void main(String[] args) {

		//================Even number=============================
		int x = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) { // System.out.println(i); // SUM of Even number
				x += i;
			}
		}
		System.out.println("The sum of even number from 1-100 : "+x);

		
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
		int sum = 0 ;
		for (int i = 1; i <= 100; i += 2) {
			// Odd number
//			System.out.println(i);
			
			// sum of odd number and even no.
			sum += i;
		}
		System.out.println("The sum of odd number from 1-100 : "+sum);
		
		//==============Sum of all Numbers from 1 to 100====================
		int z = 0;
		for(int i = 0; i<=100; i++) {
			z += i;
		}
		System.out.println("The sum of 1-100 : "+z);
	}
}
