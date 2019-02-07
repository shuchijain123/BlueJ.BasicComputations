 import java.util.Scanner;
import java.math.*;


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        int normal1 =0;
       if(angle>0){
           normal1 = angle%360;
           
        }
        
        
          else if  (angle<0){
           normal1 = angle+360;     
        }
        
        return normal1;
    }
    

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int normal2 =0;
       normal2=Math.floorMod(integer, 360);
        return normal2;
    }
    

    public static void main(String[] args){
        
    NormalizeAngle na = new NormalizeAngle();
    Scanner input = new Scanner(System.in);
    int  anglecalc;
    
    System.out.println ("Please enter angle " );
    anglecalc=input.nextInt();
    
     
      na.normalizeValueUsingModulo(anglecalc);
      na.normalizeValueUsingFloorMod(anglecalc);
     
        
        

    
}
}
