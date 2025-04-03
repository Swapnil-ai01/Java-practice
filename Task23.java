class volume{

 double shape(double l,double b,double h){
     return l*b;
 }
 double shape(double s){
     return s*s*s;
 }
}
public class Task23 extends volume {
    public static void main(String[] args){
        volume obj = new volume();
        double l = 2.8,b = 6.2,h =6.3;
        double s = 4.2;
        System.out.println("Volume of rectangle: "+obj.shape(l,b,h));
        System.out.println("Volume of a cube: "+obj.shape(s));
    }
}
