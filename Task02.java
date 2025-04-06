// Please write "Java is an object-oriented programming language" in argument
class Task02 {
    public static void main(String[] args){
        if(args.length > 0) {
            System.out.println("This is print from command line arguments:");
            for (String i : args) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("No command line arguments is available");
        }
    }
}
