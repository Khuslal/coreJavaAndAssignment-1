package triangle;

public class Triangle {
	double a, b, c;
	//Constructor
	Triangle() {
		a = 3;
		b = 4;
		c = 5;
	}

	public double getPerimeter() {
		return a + b + c;
	}

	public double getArea() {
		double s = getPerimeter() / 2; // s = semi-perimeter;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();
		
		double p = t.getPerimeter(); // p = perimeter;
		System.out.println("Perimeter : " + p);
		
		double a = t.getArea(); // a = area;
		System.out.println("Area : " + a);
	}
}
