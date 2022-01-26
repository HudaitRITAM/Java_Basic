import java.util.*;
public class maxMinInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){ //input
            numbers[i]= sc.nextInt();
        }
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         for(int i=0;i<numbers.length;i++){
             if(numbers[i] < min){
                 min = numbers[i];
             }
             if(numbers[i]>max){
                 max = numbers[i];
             }
        }
        System.out.println("Largest nmber is: "+max);
        System.out.println("Smallest umber is: "+min);
    }

    
}
