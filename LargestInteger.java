 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int max = integers[0];
        int strlength = integers.length;
        for (int i=1; i<strlength ; i++){
            if (integers[i] > max){
                
                max=integers[i];
                
            
            }
            
        }
        
        
        return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
       int max = integers[0];
        int strlength = integers.length;
        for (int i=1; i<strlength ; i++){
            max = Math.max(max , integers[i]);
                
                max=integers[i];
                
            
            }
            return max;
        }
        
        
       
}
