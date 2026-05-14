package areaofrectangle;

import java.util.Scanner;

public class Area1 {
	int length;
	int breadth;
	Area1(int l, int b){
		length = l;
		breadth = b;
	}
	
	public int returnArea() {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Length");
		int l = scn.nextInt();
		System.out.println("Enter Breadth");
		int b = scn.nextInt();
		Area1 a1 = new Area1 (l, b);
		scn.close();
		System.out.println("Area : "+a1.returnArea());
	}
}
