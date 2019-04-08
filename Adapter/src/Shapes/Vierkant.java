package Shapes;

public class Vierkant implements Shape {
	
	int length;
	int width;
	
	public Vierkant(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getArea() {
		return this.length * this.width;
	}
}
