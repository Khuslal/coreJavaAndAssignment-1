package matrix;

public class Matrix {

	int noOfRows;
	int noOfColumns;
	int elements[][];

	public Matrix(int noOfRows, int noOfColumns) {
		this.noOfRows = noOfRows;
		this.noOfColumns = noOfColumns;

		// initialize 2D array
		elements = new int[noOfRows][noOfColumns];
	}

	public static void main(String[] args) {
		Matrix m = new Matrix(2, 4);

		// row 1
		m.elements[0][0] = 1;
		m.elements[0][1] = 2;
		m.elements[0][2] = 3;
		m.elements[0][3] = 6;

		// row 2
		m.elements[1][0] = 4;
		m.elements[1][1] = 5;
		m.elements[1][2] = 6;
		m.elements[1][3] = 9;

		System.out.println("Rows : " + m.noOfRows);
		System.out.println("Columns : " + m.noOfColumns);

		for (int i = 0; i < m.noOfRows; i++) {
			for (int j = 0; j < m.noOfColumns; j++) {
				System.out.print(m.elements[i][j] + " ");
			}
			System.out.println();
		}
	}

}
