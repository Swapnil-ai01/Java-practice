import packages.Task36pack;
public class Task36 {
    public static void main(String[] args) {
        Task36pack obj = new Task36pack();
        System.out.println("Accessing from another pckage:");
        System.out.println("Public var: "+ obj.publicVar);
        obj.publicMet();
        // only public data members and method are accessible
    }
}
