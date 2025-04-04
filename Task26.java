class ForObj{
    ForObj(){
        System.out.println("Object has been created.");
    }
    static ForObj createObj(){
    System.out.println("Returning a new object from a method.");
    return new ForObj();

}
}
public class Task26 {
    public static void main (String[] args){
        ForObj obj = ForObj.createObj();
    }
}
