import java.util.*;
public class patterns {
    public static void main(String args[]){

   //--------------------------------------------------       
    /* print the pattern(solid rectangle)
        * * * * * 
        * * * * *
        * * * * *
        * * * * *
        int n = 4;
        int m = 5;
        //outer loop
     for(int i=1;i<=n;i++){
         //inner loop
         for(int j=1;j<=m;j++){
             System.out.print("* ");
         }
         System.out.println();
     }*/
 //-------------------------------------------------------
     /* print the pattern(hollow rectangle)
        * * * * * 
        *       *
        *       *
        * * * * * 
      int n=4;
      int m=5;
      //outer loop
      for(int i=1;i<=n;i++){
          //inner loop
          for(int j=1;j<=m;j++){
              //cell -> (i,j)
              if(i==1 || j==1 || i==n || j==m){
                  System.out.print("* ");
              }else{
                  System.out.print("  ");
              }
          }
          System.out.println();
      } */
 //----------------------------------------------------------
      /* print the pattern(half pyramid)
       * 
       * *
       * * *
       * * * * 
      int n=4;
      //outer loop
      for(int i=1;i<=n;i++){
          //inner loop
          for(int j=1;j<=i;j++){ 
              System.out.print("* ");
            }
          System.out.println();
      } */
 //------------------------------------------------
     /*print the pyramid(inverted half pyramid)
     * * * * 
     * * *
     * *
     *
      int n=4;
      //outer loop
      for(int i=n;i>=1;i--){
          //inner loop
          for(int j=1;j<=i;j++){ 
              System.out.print("* ");
            }
          System.out.println();
      } */
 //---------------------------------------------------
 /*print the pattern (inverted half pyramid rotated by 180 deg.)
           * 
         * *
       * * *
     * * * * 
      
     int n=4;
      //outer loop
     for(int i=1;i<=n;i++){
            //inner loop ->space print
            for(int j=1;j<=n-i;j++){ 
               System.out.print("  ");
            }
            //inner loop ->star print
           for(int j=1;j<=i;j++){
              System.out.print("* ");
            }
         System.out.println();
        } */
  //------------------------------------------------
 /* print the pattern(half pyramid with numbers)
    1 
    1 2       
    1 2 3     
    1 2 3 4   
    1 2 3 4 5

  int n=5;
  //outer loop
    for(int i=1;i<=n;i++){
        //inner loop 
        for(int j=1;j<=i;j++){ 
           System.out.print(j+" ");
        }
      System.out.println();
     } */
 //-------------------------------------------------
 /* print the pattern (inverted pyramid with numberes)
     1 2 3 4 5 
     1 2 3 4
     1 2 3
     1 2
     1
     int n=5;
     //outer loop
     for(int i=1;i<=n;i++){
       //inner loop 
       for(int j=1;j<=n-i+1;j++){ 
          System.out.print(j+" ");
       }
     System.out.println();
     } */
 //-----------------------------------------------
  /* print the pattern(floyd's triangle)
    1 
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
     int n=5;
     int num = 1;
     //outer loop
     for(int i=1;i<=n;i++){
       //inner loop 
         for(int j=1;j<=i;j++){ 
              System.out.print(num+" ");
              num++;
             }
         System.out.println();
         } */
 //-------------------------------------------
 /* print the pattern (0-1 triangle)
    1 
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1 */
     int n=5;
      //outer loop
     for(int i=1;i<=n;i++){
       //inner loop 
        for(int j=1;j<=i;j++){ 
            int sum=i+j;
            if(sum % 2 == 0){ //even
                System.out.print("1 ");
            }else{   //odd
                System.err.print("0 ");
            }
            }
         System.out.println(); 
         } 
 //---------------------------------------
    }
    
}
