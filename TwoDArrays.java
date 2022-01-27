
import java.util.*;
public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][]numbers = new int[rows][cols];
        // find x in matrix and show the index number as output

        //input
        for(int i=0;i<rows;i++){        //rows
            for(int j=0;j<cols;j++){    //cols
                numbers[i][j] = sc.nextInt();
            }
        }
        int x=sc.nextInt();

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //compare
                if(numbers[i][j] == x){
           
                System.out.println(" x found at location ("+i+","+j+")"); //for format as matrix 
                }
            }
        }


    }
}
