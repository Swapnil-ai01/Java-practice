// Please write number in command line arguments
class Task04{
    public static void main(String[] args){
        if (args.length==0) {
            System.out.println("Nothing in arguments");
        }else{
            int sum = 0;
            for(String i :args){
                sum += Integer.parseInt(i);
            }
            System.out.print("Sum of the numbers in command line args = "+ sum);
        }
    }
}
