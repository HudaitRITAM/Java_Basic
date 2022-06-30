public class LLReverse_useRecursion {
        Node head;
        private int size;
        LLReverse_useRecursion(){
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
    
        public Node reverseRecursion(Node head){  //Use Recursion Method
            if(head == null || head.next == null){
                return head;
            }
            Node newHead = reverseRecursion(head.next);
            head.next.next =head;
            head.next = null;
            return newHead;
        }
    
        public static void main(String args[]) {
            LLReverse_useRecursion list = new LLReverse_useRecursion();
            list.addLast(1);
            list.addLast(2);
            list.addLast(3);
            list.addLast(4);
            list.printList();
            
            list.head = list.reverseRecursion(list.head);
            list.printList();
    
            
        }
        
    }


