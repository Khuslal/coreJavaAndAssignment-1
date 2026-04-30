package looping;

public class DoWhileTest {
	public static void main(String[] args) {
//		9 * 1 = 9
		int n = 9;
		int x = 1;
		
		do {
			System.out.println(n+"*"+x+":"+(n*x));
			x++;
		}while(x<=10);
	}
}
