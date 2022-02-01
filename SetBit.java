//Set the 2nd bit(position =1)of a number n. (n=0101 = 5)
import java.util.*;
public class SetBit {
    public static void main(String args[]){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;

        System.out.println(newNumber);
      
        
        
    }
    
}
