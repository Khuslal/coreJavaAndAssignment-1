package matrix;

import java.util.Scanner;

public class Matrix {
	int noOfRows;
	int noOfColumns;
	int elements [][];
	
	// Constructor
	Matrix(int noOfRows, int noOfColumns){
		this.noOfRows = noOfRows;
		this.noOfColumns = noOfColumns;
		// Initialize 2D array
		elements = new int[noOfRows][noOfColumns];
	}
	
	// Method
	public int elements() {
		return noOfRows*noOfColumns;
	}
	
	// Main Method
	public static void main(String[] args) {
		
		// Scanner and Input
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int rows = scn.nextInt();
		
		System.out.println("Enter columns : ");
		int columns = scn.nextInt();
		
		
		// Creating Object
		Matrix m1 = new Matrix(rows, columns);

		// Output
		System.out.println("Rows :"+m1.noOfRows);
		System.out.println("Columns :"+m1.noOfColumns);
		System.out.println("Elements :"+m1.elements());
		
		// Looping Statement
		for(int i = 0; i < rows; i++) {
			System.out.println("Elements for row "+i+" : ");
			for(int j = 0; j < columns; j++) {
				m1.elements[i][j]= scn.nextInt(); 
			}
			System.out.println();
		}
		
		// For each to retrieve the value
		for(int row [] : m1.elements) {
			System.out.print("|");
			for(int element : row) {
				System.out.print(element+" ");
			}
			System.out.println("|");
		}
		scn.close();
	}
	

}
