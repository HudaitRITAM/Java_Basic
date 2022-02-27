public class Recursion_sortedStrictlyIncreasing {
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        /*if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);  // arr is sorted till now
        }else{
            return false;
        } */                   //--------same things diff aproches------
        if(arr[idx]>=arr[idx+1]){
            return false;                      /// arr is unsorted
        }else{
            return isSorted(arr, idx+1);
        }
    }
    public static void main(String args[]){
        int arr[]={1,3,3,5};
        System.out.println(isSorted(arr, 0));

    }
    
}
