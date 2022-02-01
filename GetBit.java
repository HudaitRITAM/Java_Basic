//Get the 3rd bit(position =2)of a number n. (n=0101 = 5)
import java.util.*;
public class GetBit {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }
        
    }
    
}