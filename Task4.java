import java.util.Scanner;
class Task4{
    public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    System.out.print("Write any number: ");
    int a = num.nextInt();
    int sum = 0;
    for(int i=0 ; i<=a ; i++){
        sum += i;
    }
    System.out.print("Sum of the number upto "+ a +" number = "+ sum);
}
}