import java.util.Scanner;

abstract  class Shape{
    int i;
    int j;
    double r;
    abstract double printArea();
}
class Rectangle extends Shape {
    public Rectangle(int l, int b) {
        this.i = l;
        this.j = b;
    }

    
    double printArea() {
        return i * j;
    }
}

class Triangle extends Shape{
    public Triangle(int i, double r) {
        this.i = i;
        this.r = r;
    }
    
   
    double printArea(){
        return 0.5*i*r;
    }
}
class Circle extends Shape{
    public Circle(double r) {
        this.r =r;
    }
   
    double printArea(){
        return Math.PI*(r*r);

    }
}
public class Shapes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter dimensions of rectangle(l and b):");
       int l = s.nextInt();
       int b = s.nextInt();

        Shape r = new Rectangle(l,b);
        double area1;
        area1=r.printArea();

        System.out.println("Enter dimensions of triangle(base and height):");
        int i = s.nextInt();
        double he = s.nextDouble();
        Shape t = new Triangle(i,he);
        double area2;
        area2=t.printArea();
        
        System.out.println("Enter dimensions of circle(radius):");
        double ra = s.nextDouble();
        Shape c = new Circle(ra);
        double area3;
        area3=c.printArea();
        System.out.println("Area of rectangle is "+ area1);
        System.out.println("Area of triangle is "+ area2);
        System.out.println("Area of circle is "+ area3);

    }
}
