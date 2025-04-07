import java.util.Scanner;
class Task13{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 number.");
    int[] array = new int[5];
    for(int i = 0; i<5;i++){
        System.out.print("In place " +(i+1)+ " : ");
        array[i] = sc.nextInt();
    }
    System.out.print("You entered in array : ");
    for(int i = 0;i<5;i++){
        System.out.print(array[i]);
        if(i<4)System.out.print(",");
    }
    for(int i=0;i<5;i++){
        for(int j=0;j<(5-i)-1;j++){
            if(array[j]>array[j+1]){
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
            }
        }
    }
    System.out.print("\nSorted array : ");
    for(int i = 0;i<5;i++){
    System.out.print(array[i]);
    if(i<4)System.out.print(",");
    }
 }
}
