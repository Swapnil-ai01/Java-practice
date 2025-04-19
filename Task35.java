interface Binary{
    int binaryToDecimal(String binary);
    String decimalToBinary(int decimal);
    String twoComplement(String binary);
    String binaryAddition(String binary1,String binary2);
}
class BinaryCalculation implements Binary{
    public int binaryToDecimal(String binary){
        return Integer.parseInt(binary,2);
    }
    public String decimalToBinary(int decimal){
        return Integer.toBinaryString(decimal);
    }
    public String twoComplement(String binary){
        StringBuilder inverted = new StringBuilder();
        for(char bit: binary.toCharArray()){
            inverted.append(bit=='0'?'1':'o');
        }
        String invertedBinary = inverted.toString();
        StringBuilder result = new StringBuilder();
        int carry = 1;
        for(int i = invertedBinary.length() - 1; i >=0; i--){
            int sum =  (invertedBinary.charAt(i) - '0') +carry;
            result.insert(0,sum%2);
            carry=sum/2;
        }
        return result.toString();
    }
    public String binaryAddition(String binary1, String binary2) {
        int length = Math.max(binary1.length(), binary2.length());
        binary1 = String.format("%" + length + "s", binary1).replace(' ', '0');
        binary2 = String.format("%" + length + "s", binary2).replace(' ', '0');
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = length - 1; i >= 0; i--) {
            int bit1 = binary1.charAt(i) - '0';
            int bit2 = binary2.charAt(i) - '0';

            int sum = bit1 + bit2 + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        if (carry == 1) {
            result.insert(0, '1');
        }
        return result.toString();
    }
}
public class Task35 {
    public static void main(String[] args) {
        BinaryCalculation calc = new BinaryCalculation();

        System.out.println("Binary to Decimal (1010): " + calc.binaryToDecimal("1010"));
        System.out.println("Decimal to Binary (10): " + calc.decimalToBinary(10));
        System.out.println("Two's Complement (1010): " + calc.twoComplement("1010"));
        System.out.println("Binary Addition (1010 + 0101): " + calc.binaryAddition("1010", "0101"));
    }
}
