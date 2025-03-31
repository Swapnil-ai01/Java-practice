class Task10{
    public static void main(String[] args){
        String strNumber = "123";
        int convertedInt = Integer.parseInt(strNumber);
        System.out.println("String to integer conversion");
        System.out.println(" String value : " + strNumber);
        System.out.println(" converted value : " + convertedInt);
    
        int num = 456;
        String convertedStr = String.valueOf(num);
        System.out.println("Integer to String Conversion:");
        System.out.println("Integer value: " + num);
        System.out.println("Converted to String: " + convertedStr);

        char ch = 'A';
        int asciiValue = ch; 
        System.out.println("Character to Integer Conversion:");
        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + asciiValue);
    }
}