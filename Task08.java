import java.util.Scanner;
class Task08{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number for reverse the digits: ");
        int OrgNum = sc.nextInt();
        sc.close();
        int  rev=0;
        while(OrgNum != 0){
            rev = rev * 10 + (OrgNum % 10);
            OrgNum /= 10;
        }
        System.out.println("The reverse numberis : "+rev);

    }
}
