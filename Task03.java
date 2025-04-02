import java.util.Scanner;
class Task03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write two number for operations");
        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("The Sum = " +(a +  b));
        System.out.println("The Subtraction = " +(a - b));
        System.out.println("The Multiplication = " +(a * b));
        System.out.println("The Division = " +(a / b));
        System.out.println("The Modulus = " +(a % b));
    }
}
