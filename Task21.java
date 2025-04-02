class Rectangles{
    double l,b;
    Rectangles(double l, double b){
        this.l = l;
        this.b = b;
    }
    double Area(){
        return l*b;
    }
    void display(){
        System.out.println("The area of rectangle: "+Area());
    }
}
public class Task21 {
    public static void main(String[] args) {
        Rectangles rect1 = new Rectangles(4.5, 5.0);
        Rectangles rect2 = new Rectangles(5.5, 12.8);
        rect1.display();
        rect2.display();
    }
}
