package areaofrectangle;

public class AreaOFRectangle {
	public static void main(String[] args) {
		Area area = new Area();
		area.setDim(3, 5);
		int areaofrect = area.getArea();
		System.out.println("Area : "+areaofrect);
	}
}
