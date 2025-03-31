import java.util.Scanner;
class Task3 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Write two number for operations");
        System.out.print("First number: ");
        int a = obj.nextInt();
        System.out.print("Second number: ");
        int b = obj.nextInt();
        System.out.println("The Sum = " +(a +  b));
        System.out.println("The Subtraction = " +(a - b));
        System.out.println("The Multiplication = " +(a * b));
        System.out.println("The Division = " +(a / b));
        System.out.println("The Modulus = " +(a % b));
    }
}