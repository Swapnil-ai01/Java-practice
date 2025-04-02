class rectangle{
    double l,b;
    void initialize(double l,double b){
        this.l = l;
        this.b = b;
    }
    double calculaction(){
        return l*b;
    }
    void display(){
        System.out.println("The area of rectangle : "+calculaction());
    }
}
public class Task20 {
    public static void main(String[] args){
        rectangle Rect1 = new rectangle();
        rectangle Rect2 = new rectangle();
        Rect1.initialize(20.4,40.6);
        Rect2.initialize(7.2,3.0);
        Rect1.display();
        Rect2.display();
    }
}
