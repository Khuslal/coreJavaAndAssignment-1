package methods;

public class AreaUsingMethodCall {
	public static void main(String[] args) {
		int area = getArea(4, 2);
		System.out.println("Area of rectangle : "+area);
		
		int volume = volume(area,2);
		System.out.println("Volume of rectangle : "+volume);
	}
	static int getArea(int l, int b){
		int area = l*b;
		return area;
	}
	
	static int volume(int area, int h) {
		int volume = area*h;
		return volume;
	}
}
