package oops;

public class Rectangle {
	int length = 7; 
	int width = 4;
	int area = length*width;
	
	// methods
	void printRectangle() {
		System.out.println("\nRectangle :");
		System.out.println("Length : "+length);
		System.out.println("Width : "+width);
		System.out.println("Area : "+area);
	}
}
