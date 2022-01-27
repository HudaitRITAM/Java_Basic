import java.util.*;
//replace 'e' with 'i'
public class ReplaceStringLetter {
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    String org = sc.next();
    String rslt = "";

    for(int i=0; i<org.length(); i++){

        if(org.charAt(i) == 'e'){
            rslt +='i';
        }else{
            rslt += org.charAt(i);
        }
    }    
      System.out.println(rslt);

  }
}

