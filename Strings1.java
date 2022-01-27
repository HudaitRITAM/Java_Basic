import java.util.*;
public class Strings1 {
  public static void main(String[] args) {
      //Scanner sc= new Scanner(System.in);


     /* //concatination

      String firstname = "Ritam";
      String lastname = "Hudait";
      String fullname = firstname+ "@" +lastname;
      System.out.println(fullname.length());


     //charAt

     for(int i=0;i<fullname.length();i++){
         System.out.println(fullname.charAt(i));
     }
    } */


    /*//compare

    String name1="Ritam";
    String name2="Hudait";
    //1 S1 > S2 : +ve value
    //2 S1 == S2 : 0
    //3 S1 < S2  : -ve value
    if(name1.compareTo(name2) == 0){
        System.out.println("String are equal");

    }else{
        System.out.println("String are not equal");
    }*/

//substirng(beg index, end index)
      String sentence = "My name is Ritam Hudait";

         //String name = sentence.substring(11,sentence.length());
         String name = sentence.substring(11);  //by default take last index

           System.out.println(name);
    }
}
