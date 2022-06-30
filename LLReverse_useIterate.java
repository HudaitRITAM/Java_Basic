
public class LLReverse_useIterate{
    Node head;
    private int size;
    LLReverse_useIterate(){
        size = 0;
    }
    public class Node{           //Linked List
        int data;
        Node next;
        Node(Integer data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(Integer data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(Integer data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next!= null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void printList(){
        Node currNode = head;
        while(currNode!=null){
        System.out.print(currNode.data+"-> ");
        currNode = currNode.next;
        }
       System.out.println("Null");

    }
    


    
    public int getSize(){
        return size;
    }

    public void reverseIterate(){                   //Use Iterative Method
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String args[]) {
        LLReverse_useIterate list = new LLReverse_useIterate();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        
        list.reverseIterate();
        list.printList();

        
    }
    public void reverseRecursion() {
    }
    
}
