public class Task40 {
    static void checkAge(int age)throws ArithmeticException{
        if (age <18) {
            throw new ArithmeticException("Not eligible");
        }else{
            System.out.println("Eligible");
        }
    }
    public static void main(String[] args){
        try{
            checkAge(16);
        }catch(ArithmeticException e){
            System.out.println("Catch exception"+e.getMessage());
        }finally {
            System.out.println("This block always excecutes");
        }
    }
}
