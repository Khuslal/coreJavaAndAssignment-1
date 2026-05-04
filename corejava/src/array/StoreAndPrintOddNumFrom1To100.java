package array;

public class StoreAndPrintOddNumFrom1To100 {

	public static void main(String[] args) {

		int odd[] = new int[50];
		int index = 0;
		
		// Store odd numbers
		for (int i = 1; i <= 100; i++) {
			if(i%2 != 0) {
				odd[index] = i;
				index++;
			}
		}
		
		// Print odd numbers
		for (int x : odd) {
			System.out.println(x);
		}
	}
}
