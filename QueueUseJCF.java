import java.util.*;
public class QueueUseJCF {

    public static void main(String args[]){
        //Queue q = new Queue();
       // Queue<Integer> q = new ArrayDeque<>(); // we can impleted in both class LinkedList And ArrayDeque
        Queue<Integer> q = new LinkedList<>(); // because Queue is a Interface not A class that why LinkedList
        q.add(1);                                   //Interface doesn't have object 
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while(!q.isEmpty()){
            System.out.println(q.remove());
            
        }

    }
    
}
