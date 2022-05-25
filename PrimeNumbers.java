import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        double numby=1;
        // System.out.println("prime numbers: 3,5,7, ");
        // }
        // Java program to display Prime numbers till N
        long start=System.currentTimeMillis();
        // int[] myNums=new int[10000];
        // int base=3;
 
        for (double num = 100000000000000.0; num > 3; num--) {
            
            boolean test=true;
            if(num%2==0||num%3==0||num%5==0||num%7==0){
                test=false;
                
            }
            else{
            for (double i = 2; i <  java.lang.Math.sqrt(num); i++) {
                if ((num % i == 0)) {
                    test=false;
                }

                
            }
        }
            
            if(test==true){
                numby=num;
                System.out.println(numby);
                break;
                // base=base+1;
                // myNums[base]=num;
                // System.out.println();
            }
            
            
            // else{
            //     System.out.println("test");
            // }
        }
        // myNums[0]=2;
        // myNums[1]=3;
        // myNums[2]=5;
        // myNums[3]=7;
        
        // System.out.println(Arrays.toString(myNums));
        long end=System.currentTimeMillis();
        System.out.println(numby);
        long time=end-start;
            System.out.println(time+"milli seconds");
    }
}

