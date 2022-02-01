
import java.util.*;

 

class BubbleSort {

   public static void printArray(int arr[]) {

       for(int i=0; i<arr.length; i++) {

           System.out.print(arr[i]+" ");

       }

       System.out.println();

   }

 

   public static void main(String args[]) {

       int arr[] = {7, 8, 1, 3, 2};

       //time complexcity = O(n^2)

       //bubble sort

       for(int i=0; i<arr.length-1; i++) {  //n-1

           for(int j=0; j<arr.length-i-1; j++) {

               if(arr[j] > arr[j+1]) {

                   //swap

                   int temp = arr[j];

                   arr[j] = arr[j+1];

                   arr[j+1] = temp;

               }

           }

       }

 

       printArray(arr);

   }
}
