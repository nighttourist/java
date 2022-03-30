
import java.util.Scanner;


public class Numberconversion {
    public static void main(String[] args) {
        int decimal;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Decimal Value :");
        decimal=input.nextInt();
        
        String binary=Integer.toBinaryString(decimal);
        System.out.println("binary="+binary);
        
        String Octal=Integer.toOctalString(decimal);
        System.out.println("Octal="+Octal);
        
        String Hex=Integer.toHexString(decimal);
        System.out.println("Hexadecimal="+Hex);
    }
}
