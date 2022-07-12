import java.util.*;
public class BinaryTree_HeightOfTree {
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
    static class BinaryTre{
        static int idx = -1;
        public static Node BuildTree(int nodes[]){
            idx ++;
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
    public static void main(String agrs[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTre tree = new BinaryTre();
        Node root = tree.BuildTree(nodes);

        System.out.println(Height(root));

    }
    
}
