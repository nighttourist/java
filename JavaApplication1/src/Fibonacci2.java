
public class Fibonacci2 {
   public static void main(String[] args) 
	{
		 int maxNumber = 10, previousNumber = 1, nextNumber = 1;
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        int i=1,sum=0;
	        while(i <= maxNumber)
	        {
	            System.out.print(previousNumber+" ");
	             sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	            i++;
	        }
               System.out.println();
 System.out.println("Sum of fibonacci is = "+sum);
	}
}
