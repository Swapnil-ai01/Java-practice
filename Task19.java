
class Rectangle{
    public double l,b;
    Rectangle(double l,double b){
        this.l = l;
        this.b =b;
    }

    double calculation(){
        return (l * b);
    }
    void display(){
        System.out.println("Area of rectangle is : "+ calculation());
    }
}

public class Task19{
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(5.0,4.0);
        Rectangle rectangle2 = new Rectangle(12.4,9.0);
        rectangle1.display();
        rectangle2.display();

    }

}
