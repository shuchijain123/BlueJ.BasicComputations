 
import java.util.Scanner;
import java.util.*;
import java.math.*;
import java.io.*;


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        
        String binary = Integer.toBinaryString(value);
        
        
        return binary;
    }

    public String printIntegerAsOctal(int value){
        String octal = Integer.toOctalString(value);
        
        
        return octal;
    }

    public String printIntegerAsHexadecimal(int value){
       String hex = Integer.toHexString(value);
        
        
        return hex;
    }

    public static void main(String[] args){
        IntegerPrinter IP = new IntegerPrinter();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Number");
        int number = in.nextInt();
        System.out.println("Binary Value is" + IP.printIntegerAsBinary(number));
        System.out.println("Hexadecimal Value is" + IP.printIntegerAsHexadecimal(number));
        System.out.println("Octal Value is" + IP.printIntegerAsOctal(number));


    }
}
