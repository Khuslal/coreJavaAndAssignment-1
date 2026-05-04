package array;

public class StoreAndPrintEvenNumFrom1To100 {
	public static void main(String[] args) {
		int even [] = new int [50];
		int index = 0;
		
		// Stores the value here inside the loop
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				even[index] = i;
				index++;
			}
		}
		
		// Print the value here using for each loop
		for(int x : even) {
			System.out.println(x);
		}
	}
}
