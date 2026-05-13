package task1;

public class Shape {
	String color="White";
	Point location=new Point(0,0);
	
	Shape(String color){
		this.color=color;
	}
	Shape(){
	}
	
	double getX() {
		return location.getX();
	}
	double getY() {
		return location.getY();
	}
	void setLocation(double x, double y) {
		location.setX(x);
		location.setY(y);
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color=color;
	}
	void Print() {
		location.Print();
	}
}
