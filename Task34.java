interface Shape{
    double Pi = 3.14;
    double area();
    double perimeter();
}
class circle implements Shape{
    double radius;
    circle(double radius){
        this.radius =radius;
    }
    public double area(){
        return Pi * radius * radius;
    }
    public double perimeter(){
        return 2 * Pi * radius;
    }
}
class rectangles implements Shape{
    double l,b;
    rectangles(double l,double b){
        this.l = l;
        this.b = b;
    }
    public double area(){
        return l * b;
    }
    public double perimeter(){
        return 2 * l * b;
    }
}
class square implements Shape{
    double side;
    square(double side){
        this.side=side;
    }
    public double area(){
        return side * side;
    }
    public double perimeter(){
        return 4 * side;
    }
}
public class Task34 {
    public static void main(String[] args){
        Shape circle = new circle(14);
        Shape rect = new rectangles(4,6);
        Shape square = new square(8);
        System.out.println("Circle Area: "+circle.area()+" Perimeter: "+circle.perimeter());
        System.out.println("Rectangle Area: "+rect.area()+" Perimeter: "+rect.perimeter());
        System.out.println("Square Area: "+square.area()+" Perimeter: "+square.perimeter());
    }
}
