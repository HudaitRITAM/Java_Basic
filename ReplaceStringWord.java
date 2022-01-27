import java.util.*;
//delet the part afetr @ and print the usr only 
public class ReplaceStringWord {
    public static void main(String args[]){
     Scanner sc = new Scanner (System.in);
     String email = sc.next();
     String usr = "";
      for(int i=0;i<email.length();i++){
          if(email.charAt(i) == '@'){
            break;
          }else{
              usr += email.charAt(i);
          }
      }
      System.out.println(usr);
    }
    
}
