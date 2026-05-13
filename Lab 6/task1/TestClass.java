package task1;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Testing the Point Class:");
		Point testPoint = new Point(2,8);
		System.out.println("Before Changes:\nPoint.getX(): "+testPoint.getX()+
				"\nPoint.getY(): "+testPoint.getY());
		testPoint.setX(9);
		testPoint.setY(4);
		System.out.println("After Changes:\nPoint.getX(): "+testPoint.getX()+
				"\nPoint.getY(): "+testPoint.getY());
		testPoint.Print();
		
		System.out.println("\n\nTesting the Shape Class:");
		Shape testShape = new Shape();
		System.out.println("Before Changes:\nShape.getX(): "+testShape.getX()+
				"\nShape.getY(): "+testShape.getY()+
				"\nShape.getColor(): "+testShape.getColor());
		testShape.setColor("Green");
		testShape.setLocation(3, 5);
		System.out.println("After Changes:\nShape.getX(): "+testShape.getX()+
				"\nShape.getY(): "+testShape.getY()+
				"\nShape.getColor(): "+testShape.getColor());
		testShape.Print();
		
		System.out.println("\n\nTesting the Circle Class:");
		Circle testCircle = new Circle(5);
		System.out.println("Before Changes:\nCircle.getCenter(): "+testCircle.getCenter()+
				"\nCircle.getColor(): "+testCircle.getColor());
		testCircle.setCenter(4, 8);
		testCircle.setColor("Red");
		System.out.println("After Changes:\nCircle.getCenter(): "+testCircle.getCenter()+
				"\nCircle.getColor(): "+testCircle.getColor());
		testCircle.Print();
		
		System.out.println("\n\nTesting the Square Class:");
		Rectangle testRectangle = new Rectangle(4,8);
		System.out.println("Before Changes:\nRectangle.getCornerLeftLow(): "+testRectangle.getCornerLeftLow()+
				"\nRectangle.getCornerLeftUpp(): "+testRectangle.getCornerLeftUpp()+
				"\nRectangle.getCornerRightLow(): "+testRectangle.getCornerRightLow()+
				"\nRectangle.getCornerRightUpp(): "+testRectangle.getCornerRightUpp()+
				"\nRectangle.getColor(): "+testRectangle.getColor()+
				"\nRectangle.getArea(): "+testRectangle.getArea());
		testRectangle.setLocation(7, 3);
		testRectangle.setColor("Blue");
		System.out.println("After Changes:\nRectangle.getCornerLeftLow(): "+testRectangle.getCornerLeftLow()+
				"\nRectangle.getCornerLeftUpp(): "+testRectangle.getCornerLeftUpp()+
				"\nRectangle.getCornerRightLow(): "+testRectangle.getCornerRightLow()+
				"\nRectangle.getCornerRightUpp(): "+testRectangle.getCornerRightUpp()+
				"\nRectangle.getColor(): "+testRectangle.getColor()+
				"\nRectangle.getArea(): "+testRectangle.getArea());
		testRectangle.Print();
	}

}
