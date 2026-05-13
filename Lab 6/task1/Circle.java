package task1;

public class Circle extends Shape {
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	void setCenter(double x, double y) {
		setLocation(x,y);
	}
	Point getCenter() {
		return location;
	}
}
