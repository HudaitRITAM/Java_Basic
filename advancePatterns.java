//import java.util.*;
public class advancePatterns {
public static void main(String args[]){

/* print the pattern(butterfly pattern)
*             * 
* *         * * 
* * *     * * * 
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *

 int n=4;
//upper half
 for(int i=1;i<=n;i++){
     //1st part
     for(int j=1;j<=i;j++){
         System.out.print("* ");
         }
      //spaces
      int spaces = 2*(n-i);
     for(int j=1;j<=spaces;j++){
         System.out.print("  ");
         }
     //2nd part
     for(int j=1;j<=i;j++){
         System.out.print("* ");
         }
             System.out.println();
         }
     //lower half
     for(int i=n;i>=1;i--){
     //1st part
     for(int j=1;j<=i;j++){
         System.out.print("* ");
         }
     //spaces
     int spaces = 2*(n-i);
     for(int j=1;j<=spaces;j++){
         System.out.print("  ");
        }
     //2nd part
     for(int j=1;j<=i;j++){
         System.out.print("* ");
         }
     System.out.println();
     } */
//-----------------------------------------------------------------
/*print the pattern(solid Rhombus)
              * * * * * 
            * * * * *
          * * * * *
        * * * * *
      * * * * *
  int n =5;
  for(int i=1;i<=n;i++){
      //spaces
      for(int j=1;j<=n-i;j++){
          System.out.print("  ");
      }
      //stars
      for(int j=1;j<=n;j++){
          System.out.print("* ");
      }
      System.out.println();
     }  */
//-----------------------------------------------------------------------------
/* print the pattern(number pyramid)
                1 
               2 2
              3 3 3
             4 4 4 4
            5 5 5 5 5
    int n=5;
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //number ->print roe no, row no times
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    } */
//--------------------------------------------------------------------------
/* print the pattern(palindromic pattern)
             1
            212
           32123
          4321234
         543212345

    int n=5;
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");           
        }
        //1st half number
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        //2nd half number
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }  */
//----------------------------------------------------------------------------
/* print the patterns(diamond)
                *
               ***
              *****
             *******
             *******
              *****
               ***
                * 
*/
   int n=4;
   for(int i=1;i<=n;i++){
       //spaces
       for(int j=1;j<=n-i;j++){
           System.out.print(" ");
       }
       //stars
       for(int j=1;j<=2*i-1;j++){
           System.out.print("*");
       }
       System.out.println();
   }
   //lower half
   for(int i=n;i>=1;i--){
    //spaces
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    //stars
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}  
  }
 
}