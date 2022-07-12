
import java.util.HashSet;
import java.util.Iterator;
public class HashShing {
    public static void main(String args[])
    {
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(3);   //Duplicates

        //search-contains
        if(set.contains(2)){
            System.out.println("set contain");
        }
        if(!set.contains(7)){
            System.out.println("not contain");
        }
        //delete 
        set.remove(3);

        //size
        System.out.println("Size of the set " + set.size());

        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
    
}
