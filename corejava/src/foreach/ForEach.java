package foreach;

public class ForEach {
	public static void main(String[] args) {
		int s = 0;
		int data []= { 12, 20, 30, 40, 50};
		for(int x : data) {
			System.out.println(x);
			s += x;
		}
		System.out.println("Sum : "+s);
	}
}
