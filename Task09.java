class Task09{
    public static void main(String[] args){
        int intNum = 100;
        double doubleNum = intNum;
        System.out.println("Implicit typecasting");
        System.out.println(" Integer value : " + intNum);
        System.out.println(" Convert to double : " + doubleNum);

        double newDouble = 99.99;
        int newInt = (int) newDouble;
        System.out.println("Explicit typecasting");
        System.out.println(" Double value : " + newDouble);
        System.out.println(" Convert to int : " + newInt);

    }
}
