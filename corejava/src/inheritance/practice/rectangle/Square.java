package inheritance.practice.rectangle;

public class Square extends Rectangle {
	
	Square(int s) {
// passing 's' as argument for both length and breadth inside the Rectangle Constructor
		super(s, s);
	}

}
