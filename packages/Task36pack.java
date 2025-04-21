package packages;

public class Task36pack {
    public int publicVar = 1;
    protected int protectedVar =2;
    int defaultVar = 3;
    private int privateVar = 4;
    public void publicMet(){
        System.out.println("Public method called");
    }
    protected void protectedMet(){
        System.out.println("Protected method called");
    }
    void defaultMet(){
        System.out.println("Default method called");
    }
    private void privateMet(){
        System.out.println("Private method called");
    }
    public void display(){
        System.out.println("Inside same class");
        System.out.println("Public var:"+publicVar);
        System.out.println("Protected var: "+protectedVar);
        System.out.println("Private Var:"+privateVar);
        publicMet();
        protectedMet();
        defaultMet();
        privateMet();
    }
}
