class Volume{
    double volume;
    Volume(double l,double b,double h){
        volume = l*b*h;
    }
    Volume(double s){
        volume = s*s*s;
    }
    void display(){
        System.out.println(volume);
    }
}
public class Task24 {
    public static void main(String[] args){
        Volume rect = new Volume(4.2,3.5,2.5);
        Volume cube = new Volume(10);
        System.out.print("Volume of rectangle: ");
        rect.display();
        System.out.print("Volume of cube: ");
        cube.display();
    }
}
