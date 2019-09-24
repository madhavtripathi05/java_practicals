import java.util.*;

class DistributedSummation extends Thread{
    static Double sum = 0.0;
    Double x,y;

    DistributedSummation(Double x,Double y){
        this.x = x;
        this.y = y;
    }
    
    synchronized public void run() {
        for (Double i = x; i < y; i++) {
            sum+=i;
        }
        System.out.println("Sum : "+sum.intValue());
    
    }
}

/**
 * mprac35
 */
public class mprac35 {

    public static void main(String[] args)throws InputMismatchException{
        Double N = Double.parseDouble(args[0]);
        Integer noOfTheads = Integer.parseInt(args[1]);
        // DistributedSummation ds1 = new DistributedSummation(1.0,100.0);
        // DistributedSummation ds2 = new DistributedSummation(100.0,1000.0);
        // DistributedSummation ds3 = new DistributedSummation(1000.0,10000.0);
        
   
        for (int i = 0; i < noOfTheads; i++) {
            DistributedSummation ds[] = new DistributedSummation[noOfTheads];
            ds[i] = new DistributedSummation(1.0, N);
             ds[i].start();
        }
        // ds1.start();
        // ds2.start();
        // ds3.start();
    }
}