import java.security.DigestException;

class Animal{
    String color = "White";
}
class dog extends Animal{
    String color = "black";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class Task32 {
    public static void main(String[] args){
        dog S = new dog();
        S.printcolor();
    }
}
