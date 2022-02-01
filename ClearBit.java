//Get the 3rd bit(position =2)of a number n. (n=0101 = 5)
import java.util.*;
public class ClearBit {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        
        int newNumber = notBitMask & n;

        
            System.out.println(newNumber);
      
        
    }
    
}
