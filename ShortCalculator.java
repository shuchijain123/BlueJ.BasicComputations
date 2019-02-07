 
import java.util.Scanner;
import java.math.*;

public class ShortCalculator {
    short  sum =0;
    public short unsignedsum(short a, short b){
        
         sum = (short)(a+b);
         System.out.println ("Sum of short is " + sum);
        return sum;
        
        
    }
    short diff =0;
    public short difference(short a, short b){
        
         diff = (short)(a-b);
         System.out.println ("Difference of short is " + diff);
        return diff;
        
        
    }
    short quo =0;
    public short quotient(short a, short b){
        
         quo = (short)(a/b);
         System.out.println ("Quotient of short is " + diff);
        return quo;
        
        
    }
    
    short remain =0;
    public short remainder(short a, short b){
        
         remain = (short)(a%b);
         System.out.println ("Remainder of short is " + remain);
        return remain;
        
        
    }
    

public static void main (String[] args){
    
    ShortCalculator sc = new ShortCalculator();
    Scanner input = new Scanner(System.in);
    short number1;
    short number2;
    System.out.println ("Please enter number1 " );
    number1=(short)input.nextInt();
    
     
     System.out.println ("Please enter number2 " );
     number2=(short)input.nextInt();
     sc.unsignedsum(number1,number2);
     sc.difference(number1,number2);
     sc.quotient(number1,number2);
      sc.remainder(number1,number2);
     
     
    
    
    
    
    
}
}