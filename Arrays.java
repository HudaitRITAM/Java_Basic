import java.util.*;
public class Arrays {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
        // int[] marks = new int[3];
       // int marks[]={96,95,99};
      /* int marks[]=new int[3];
        marks[0]=96;
        marks[1]=95;
        marks[2]=99; */
        //System.out.println(marks[0]);
       // System.out.println(marks[1]);
       // System.out.println(marks[2]);
       int numbers[]= new int[size];
       for(int i=0;i<size;i++){  // taking input
           numbers[i]=sc.nextInt();
       }

       int x=sc.nextInt();
       for(int i=0;i<numbers.length;i++){  //linear seaarch
        if(numbers[i] == x){

            System.out.println("x found at index :"+i);
        }
          
       }
    }
    
}
