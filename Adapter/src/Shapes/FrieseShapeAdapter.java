package Shapes;

public class FrieseShapeAdapter implements Shape{
	FrieseShape fries;
	
	public FrieseShapeAdapter(int length, int width) {
		fries = new FrieseShape(length, width);
	}
	
	public int getArea() {
		return fries.getLength() * fries.getWidth();
	}
	
}
