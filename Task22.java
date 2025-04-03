import java.util.Scanner;
class stack{
    Scanner sc = new Scanner(System.in);
    int max=5;
    int top=-1;
    int[] stack = new int[max];
    void push(){
        if (top == max-1){
            System.out.println("Stack ovreflow!");
        }else{
            System.out.println("Enter number to push:");
            int value = sc.nextInt();
            top = top+1;
            stack[top] = value;
            System.out.println(value +" Pushed in stack");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");
        }else{
            int popped = stack[top];
            System.out.println(popped+" pop from stack");
            --top;
        }
    }
    void display(){
        if(top == -1){
            System.out.println("stack is underflow");
        }else{
            System.out.print("Element in stack are: ");
            for(int i=top;i>=0;i--){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }

}
public class Task22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        stack obj = new stack();

        while(true){
            System.out.println("\nWhat you want to do:\n 1.Push 2.Pop 3.Display 4.Exit");
            int a = sc.nextInt();
            switch(a){
                case 1 :
                    obj.push();
                    break;
                case 2 :
                    obj.pop();
                    break;
                case 3 :
                    obj.display();
                    break;
                case 4 :
                    System.out.println("Existing");
                    System.exit(0);
                    sc.close();
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }

    }
}
