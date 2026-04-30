package looping;

public class JumpingTest {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i==5 || i==7) 
				//break;
				//continue;
				//return;
				break;
			
			System.out.println(i);
		}
		System.out.println("End for loop.");
	}
}
