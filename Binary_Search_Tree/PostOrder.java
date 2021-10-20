import java.util.*;
class Node{
    int key;
    Node right,left;
    public Node(int item){
        key = item; 
        left = right = null; 
    }
}
class PostOrder 
{   Node root;
     Inorder() 
    { 
        root = null; 
    } 
   void print(Node node) 
    { 
        if (node == null) 
            return; 
        print(node.left); 
        print(node.right); 
        System.out.print(node.key + " "); 
    } 
// Wrappers over above recursive functions 
      void print()    
    {     
        printInorder(root);   
    } 
  // Driver method 
    public static void main(String[] args) 
    { 
       Inorder tree = new Inorder(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
       System.out.println("\nInorder traversal of binary tree is "); 
        tree.print(); 
  
        
    }
}
