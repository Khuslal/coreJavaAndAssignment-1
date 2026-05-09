package matrix;

import java.util.Scanner;

public class Matrix {
	int noOfRows;
	int noOfColumns;
	int elements[][];

	// Constructor
	Matrix(int noOfRows, int noOfColumns) {
		this.noOfRows = noOfRows;
		this.noOfColumns = noOfColumns;
		// Initialize 2D array
		elements = new int[noOfRows][noOfColumns];
	}

	// Method
	public int totalElements() {
		return noOfRows * noOfColumns;
	}

	public int getRows() {
		return noOfRows;
	}

	public int getColumns() {
		return noOfColumns;
	}

	// added setElement method for the replacement of 'm1.elements[i][j] =
	// scn.nextInt();' which was called inside the main method's Matrix object
	// reference m1 inside the nested loop
	public void setElement(int i, int j, int value) {
		elements[i][j] = value;
	}

	// method to display output
	public void display() {
		// For each to retrieve the value
		for (int row[] : elements) {
			System.out.print("|");
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println("|");
		}
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
		System.out.println("Rows :" + m1.getRows());
		System.out.println("Columns :" + m1.getColumns());
		System.out.println("Elements :" + m1.totalElements());

		// Looping Statement
		for (int i = 0; i < rows; i++) {
			System.out.println("Elements for row " + i + " : ");
			for (int j = 0; j < columns; j++) {
				// m1.elements[i][j] = scn.nextInt(); // setElement method is created for the
				// replacement of this line
				m1.setElement(i, j, scn.nextInt());
			}
			System.out.println();
		}

		m1.display();
		scn.close();
	}

}
