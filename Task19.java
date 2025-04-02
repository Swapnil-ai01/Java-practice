
class Rectangle {
    public double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double calculation() {
        return (l * b);
    }
}
public class Task19{
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(5.0,4.0);
        Rectangle rectangle2 = new Rectangle(12.2,9.0);
        System.out.println("The Area of the first rectangle : "+rectangle1.calculation());
        System.out.println("The Area of the second rectangle : "+rectangle2.calculation());

    }

}
