package task1;

public class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(double width, double height){
		this.width=width;
		this.height=height;
	}
	
	Point getCornerLeftLow() {
		return location;
	}
	Point getCornerLeftUpp() {
		return new Point(location.x,location.y+height);
	}
	Point getCornerRightLow() {
		return new Point(location.x+width,location.y);
	}
	Point getCornerRightUpp() {
		return new Point(location.x+width,location.y+height);
	}
	double getArea() {
		return width*height;
	}
}