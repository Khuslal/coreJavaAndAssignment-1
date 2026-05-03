package methods;
import java.util.Scanner;
public class SIAndAmount {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		int p = scn.nextInt();
		System.out.println("Enter Time: ");
		int t = scn.nextInt();
		System.out.println("Enter Rate: ");
		int r = scn.nextInt();
		int si = si(p, t, r);
		System.out.println("SI : "+si);
	}
	static int si(int p, int t, int r) {
		int si = (p*t*r)/100;
		return si;
	}
}
