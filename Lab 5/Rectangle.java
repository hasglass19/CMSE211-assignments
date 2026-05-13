package assignment5;

public class Rectangle {
	double width=1;
	double height=1;
	
	Rectangle(){
	}
	Rectangle(double newWidth,double newHeight){
		width=newWidth;
		height=newHeight;
	}
	
	double getArea() {
		return (width*height);
	}
	double getPerimeter() {
		return(2*width+2*height);
	}
	public static void main(String[] args) {
		Rectangle rec1=new Rectangle(4,40);
		Rectangle rec2=new Rectangle(3.5,35.9);
		System.out.printf("Width of Rectangle 1: %f\n"
				+ "Height of Rectangle 1: %f\n"
				+ "Area of Rectangle 1: %f\n"
				+ "Perimeter of Rectangle 1: %f\n\n"
				+ "Width of Rectangle 2: %f\n"
				+ "Height of Rectangle 2: %f\n"
				+ "Area of Rectangle 2: %f\n"
				+ "Perimeter of Rectangle 2: %f\n\n",
				rec1.width,rec1.height,rec1.getArea(),rec1.getPerimeter(),
				rec2.width,rec2.height,rec2.getArea(),rec2.getPerimeter());

	}
}