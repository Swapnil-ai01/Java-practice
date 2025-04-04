class PassBy{
    int x,y;
    //Example for pass by value
    int add(int x,int y){
        return x+y;
    }
    // Example for pass by reference
        void subtract(PassBy obj){
        obj.x = obj.x  - obj.y;
    }
}
public class Task25 {
    public static void main(String[] args){
        PassBy obj = new PassBy();
        int a = 20,b = 5;
        System.out.println("The output of pass by valur: "+obj.add(20,30));
        obj.x = a;
        obj.y = b;
        obj.subtract(obj);
        System.out.println("The output of pass by reference: "+obj.x);
    }
}
