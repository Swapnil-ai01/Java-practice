import java.util.Scanner;
class Factorial{
    int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n * fact( n-1);
        }
    }
}
public class Task27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Factorial num = new Factorial();
        System.out.print("Enter the number for factorial: ");
        int a = sc.nextInt();
        sc.close();
        if(a<0){
            System.out.println("Factorial is not defined for negative number.");
        }else {
            System.out.println("The factorial of the " + a + " = " + num.fact(a));
        }
    }
}
