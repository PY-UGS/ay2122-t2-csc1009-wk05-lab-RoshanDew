abstract class Shape{
    double dim1;
    double dim2;
    final double PI=3.14;
    double area;


    public Shape(double dim1, double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }

    abstract double area();
    }

class Rectangle extends Shape{
    Rectangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    double area(){
        this.area=this.dim1*this.dim2;
        return this.area;
    }

}

class Triangle extends Shape{
    Triangle(double dim1, double dim2){
        super(dim1,dim2);
    }

    double area(){
        this.area=this.dim1*this.dim2*0.5;
        return this.area;
    }

}

class Circle extends Shape{
    Circle(double dim1, double dim2){
        super(dim1,dim2);
    }

    double area(){
        this.area=PI*this.dim1*this.dim1;
        return this.area;
    }

}

class Ellipse extends Shape{
    Ellipse(double dim1, double dim2){
        super(dim1,dim2);
    }

    double area(){
        this.area=PI*this.dim1*this.dim2;
        return this.area;
    }

}