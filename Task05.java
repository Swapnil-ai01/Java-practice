import java.util.Scanner;
class Task05{
    public static void main(String[] args){
      Scanner num = new Scanner(System.in);
       System.out.print("Write any number to find Factorial : ");
        int a =  num.nextInt();
        num.close();
        int fact = 1;
        if (a == 0){
            fact = 1;
        }
        else{
        for(int i=1 ; i<=a ; i++){
          fact *= i;
        }
        }
        System.out.println("The factorial of "+ a +" = "+ fact);
     }
}

