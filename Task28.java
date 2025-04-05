class DemoStatic{
    static int count=0;
    int num=0;
    DemoStatic() {
        count++;
        num++;
    }
    static void staticMethod(){
        System.out.println("Number of time object call for static variable: "+count);
    }
    void display(){
        System.out.println("Number of non-static variable value: "+ num);
    }
}
public class Task28 {
    public static void main(String[] args){
        System.out.println("Static methods cannot access non-static variables directly.");
        DemoStatic obj = new DemoStatic();
        new DemoStatic();
        DemoStatic.staticMethod();
        obj.display();
    }
}
