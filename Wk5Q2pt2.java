public class Wk5Q2pt2 {

public static void main(String[] args){
    Rectangle r= new Rectangle(9,5);
    Triangle t= new Triangle(10,8);
    Circle c= new Circle(5,5);
    Ellipse e= new Ellipse(7,7);
    Shape figuref;
    figuref=r;
    System.out.println("Inside Area for Rectangle.");
    System.out.println("Area is "+ figuref.area());
    figuref=t;
    System.out.println("Inside Area for Triangle.");
    System.out.println("Area is "+ figuref.area());
    figuref=c;
    System.out.println("Inside Area for Circle.");
    System.out.println("Area is "+ figuref.area());
    figuref=e;
    System.out.println("Inside Area for Eclipse.");
    System.out.println("Area is "+ figuref.area());
}
}
