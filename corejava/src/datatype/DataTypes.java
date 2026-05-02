package datatype;
import java.util.Scanner;
public class DataTypes {
	 
		/*
		 * 	 Data Types
		 * 		proper data representation
		 * 		proper memory allocation
		 * 		proper operation to be perform
		 * 
		 * 1. Primitive:
		 *		a. byte : 1 byte (8 bit) : -128 to 127
		 *	 	b. short : 2 byte (16 bit) : -32768 to 32767
		 *		c. int
		 *	 	d. long
		 *	 	e. float
		 *		f. double 
		 *		g. char
		 *		h. boolean
		 * 
		 * 2. Non-Primitive:
		 * 		a. String : sequence of characters
		 * 		b. Array : collection of elements of same data type
		 * 		c. Class : blueprint for creating objects
		 * 		d. Interface:  blueprint for creating classes 
		 * 		e. Enum L special data type that enables for a variable to be a set
		 * 
		 */
	public static void main(String[] args) {
//		long a = 500000000000L;
//		float p = 4.6f; 
//		System.out.println(  " Byte Size : "+Byte.SIZE+" MIN Value: "+Byte.MIN_VALUE + " MAX Value: "+Byte.MAX_VALUE);
//		System.out.println( " MAX Value: "+Integer.MAX_VALUE + " Integer Size : "+ Integer.SIZE+"MIN Value: "+Integer.MIN_VALUE);
		
		int x;
		int y;

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		x= scn.nextInt();
		System.out.print("Enter the value of y: ");
		y= scn.nextInt();
		
		int add= x+y;
		int sub= x-y;
		int mul= x*y;
		float div= x/y;
		System.out.println("The value of "+ x + " + "+ y+": "+add);
		System.out.println("The value of "+ x + " - "+ y+": "+sub);
		System.out.println("The value of "+ x + " * "+ y+": "+mul);
		System.out.println("The value of "+ x + " / "+ y+": "+div);
		scn.close();
	}
}
