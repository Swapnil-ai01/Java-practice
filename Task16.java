import java.util.Scanner;
class Task16{
    public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    System.out.print("Enter year to check leap year: ");
    int year = num.nextInt();
    if(year % 4 ==0 || year % 100 == 0 || year % 400 == 0){
        System.out.println("The year "+year+" is a leap year");
    }
    else{
        System.out.println("The year "+year+" is not a leap year");
    }
    }
}