import java.util.Scanner;

class Task7{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = obj.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("First " + n + " Fibonacci numbers:");
            printFibonacci(n);
        }
    }
    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
