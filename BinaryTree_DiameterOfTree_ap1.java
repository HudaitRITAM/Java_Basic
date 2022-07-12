import java.util.*;
public class BinaryTree_DiameterOfTree_ap1 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
    }
    public static int Height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        int totalHeight = Math.max(leftHeight,rightHeight )+1;
        return totalHeight;
     }
     //Apoarch 1
    public static int diameter(Node root){               ///This function Timecomplexity O(N^2)
        if(root == null){
            return 0 ;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = Height(root.left)+Height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }
    
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree  =new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println(diameter(root));

    }

}
