import java.util.*;
public class LL_UseJCF {
    public static void main(String args[]){
        LinkedList<String> list= new LinkedList<String>();
        list.addFirst("Ritam");
        list.addFirst("Hudait");
        System.out.println(list);

        list.addLast("Home");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
    
}
