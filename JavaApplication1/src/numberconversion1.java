
import java.util.Scanner;


public class numberconversion1 {
    public static void main(String[] args) {
        
       Scanner input=new Scanner(System.in);
        System.out.println("Enter Binary Value :");
        String i=input.nextLine();
        Integer decimal =Integer.parseInt(i, 2);
        System.out.println("decimal="+decimal);
        
        
         //Scanner input1=new Scanner(System.in);
        System.out.println("Enter Octal Value :");
        String i1=input.nextLine();
         Integer decimal1 =Integer.parseInt(i1, 8);
        System.out.println("decimal="+decimal1);
        
         System.out.println("Enter Hexa Value :");
        String i2=input.nextLine();
         Integer decimal2 =Integer.parseInt(i2, 16);
        System.out.println("decimal="+decimal2);
        
    }
}
