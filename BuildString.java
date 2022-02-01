import java.util.*;
//reverse string 
public class BuildString {
    public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      String word = sc.next();
    StringBuilder sb = new StringBuilder(word);
    for(int i=0;i<sb.length()/2;i++){
        int front = i;
        int back = sb.length()-1-i;  //11-1-0 => 10

        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);
        sb.setCharAt(front,backChar);
        sb.setCharAt(back,frontChar);

    }
    System.out.println(sb);
  } 
    
}
