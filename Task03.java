//Please give two number and after that operation in command line arguments
class Task03 {
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        char c = args[2].charAt(0);
        switch(c) {
            case '+':
            System.out.println("The Sum = " + (num1 + num2));
            break;
            case '-':
            System.out.println("The Subtraction = " + (num1 - num2));
            break;
            case '*':
            System.out.println("The Multiplication = " + (num1 * num2));
            break;
            case '/':
            System.out.println("The Division = " + (num1 / num2));
            break;
            case '%':
            System.out.println("The Modulus = " + (num1 % num2));
            break;
            default:
            System.out.println("wrong argument");
            break;
        }
    }
}
