import Shapes.FrieseShapeAdapter;
import Shapes.Shape;
import Shapes.Vierkant;

public class Demo {

	public static void main(String[] args) {
		Shape vormpje = new Vierkant(4, 5);
		Shape fries = new FrieseShapeAdapter(4, 5);
		
		System.out.println(vormpje.getArea());
		System.out.println(fries.getArea());
		

	}

}
