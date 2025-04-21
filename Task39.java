public class Task39 {
    public static void main(String[] args){
        int c=100;
         try{
            try{
                System.out.println("Going to divide");
                int b=39/0;
            }catch(ArithmeticException e){
                System.out.println();
            }
            try {
                int a[]=new int[5];
                a[5]=4;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("other statement");
            c=c/0;
        }catch (Exception e){
            System.out.println("normal flow..");
        }
    }
}
