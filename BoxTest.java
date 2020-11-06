LAB_4Programe
/*Develop a Java program to create an abstract class named Shape that contains two integers and an empty method named printArea( ). 
 * Provide three classes named Rectangle, Triangle and
Circle such that each one of the classes extends the class Shape. Each one of the classes containonly 
the method printArea( ) that prints the area of the given shape.*/
public class BoxTest {
	public static void main(String args[]) {
		Rectangle rect = new Rectangle(9, 5);
		Triangle tri = new Triangle(10, 8);
		circle cir = new circle(10,10);
		Shape figure;
		figure = rect;
		figure.printArea();
		figure = tri;figure.printArea();
		figure = cir;figure.printArea();
		}
		}
abstract class Shape {
double side1;
double side2;
Shape(double a, double b) {
side1 = a;
side2 = b;
}
abstract void printArea();
}
class Rectangle extends Shape {
Rectangle(double a, double b) {
super(a, b);
}
void printArea() {
	double area = side1 * side2;
System.out.println("Inside Area for Rectangle.");
System.out.println("Area of Rectangle is = " +area);

}
}
class Triangle extends Shape {
Triangle(double a, double b) {
super(a, b);
}
void printArea() {
	double area =  side1 * side2 / 2;
System.out.println("Inside Area for Triangle is.");
System.out.println("Area of Triangle is = " + area);

}
}

class circle extends Shape {
	circle(double a, double b) {
super(a, b);
}
void printArea() {
	double area = Math.PI * side1 * side2 ;
System.out.println("Inside Area for Circle.");
System.out.println("Area of Circle is = "+ area);

}
}

