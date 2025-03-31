import java.util.Scanner;
class Task15{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the marks to know result: ");
    int mark = input.nextInt();
        if(mark <= 100 && mark >= 60){
            System.out.println("Obtained 1st class");
            }
        else if(mark <= 59 && mark >= 50){
            System.out.println("Obtained 2nd class");
            }
        else if(mark <= 49 && mark >= 40){
            System.out.println("Pass");
            }
        else if(mark <= 39 && mark >= 0){
            System.out.println("Fail");
            }
        else{
            System.out.println("Wrong input");
            }
    }

}