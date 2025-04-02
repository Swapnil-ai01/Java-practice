import java.util.Scanner;
class Task06{
    public static void main(String[] args){
        int rem;
        int sum = 0;
        Scanner num = new Scanner(System.in);
        System.out.print("Write a number for sum of the digits : ");
        int a = num.nextInt();
        num.close();
        while(a != 0){
            rem = a % 10;
            sum = sum + rem;
            a = a / 10;
        }
        System.out.println("Result = " + sum); 
    }
}
