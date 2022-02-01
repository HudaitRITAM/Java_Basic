public class InsertionSort {
        public static void printArray(int arr[]) {
    
            for(int i=0; i<arr.length; i++) {
     
                System.out.print(arr[i]+" ");
     
            }
     
            System.out.println();
     
        }
        public static void main(String args[]){
             //time complexcity O(n^2)
            //insertion sort
            int arr[]={7,8,3,1,2};
            for(int i=1;i<arr.length;i++){    //n
                int current = arr[i];
                int j = i-1;
                while(j>=0 && current < arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                }
                  //placed
                  arr[j+1] = current;
               
            }
            printArray(arr);
        }
    }

