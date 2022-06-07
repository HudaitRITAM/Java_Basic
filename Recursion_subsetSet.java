import java.util.ArrayList;
//  PRINT ALL THE SUBSETS OF A SET OF FIRST N NATURAL NUMBERS
public class Recursion_subsetSet {
    public static void printSubsets(ArrayList<Integer>subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" "); // get(i) -> print the arraylist,inbuild function
        }
        System.out.println();
    }
    public static void findSubsets(int n,ArrayList<Integer> subset){
        if(n == 0){
            printSubsets(subset);
            return;
        }
        //add
        subset.add(n);
        findSubsets(n-1, subset);
        //not add
        subset.remove(subset.size()-1);  // delet the previous adding subset at the last index
        findSubsets(n-1, subset);

    }
    public static void main(String args[]){
        int n = 3;
        findSubsets(n, new ArrayList<Integer>());
      }
}
