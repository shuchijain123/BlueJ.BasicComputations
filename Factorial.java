 


import java.math.BigInteger;

public class Factorial {
BigInteger fact = new BigInteger ("1");
    public BigInteger factorialOf(Integer value){
        
        for(int i=value; i>0; i--)
        {
            fact = fact.multiply(BigInteger.valueOf(i));
        
        }
        return fact;
    
    }
}
