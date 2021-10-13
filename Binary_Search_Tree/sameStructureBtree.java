class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree() 
    { 
        root = null; 
    } 
    BinaryTree(int data)
    {
        this.root=new Node(data);
    }
    boolean sameStructure(Node root1, Node root2)
{
if(root1==null && root2==null) return true;
if(root1==null||root2==null) return false;
return sameStructure(root1.left,root2.left)
&& sameStructure(root1.right,root2.right);
}
    
}

class sameStructureBtree{
    public static void main(String[] args) {

        BinaryTree bt=new BinaryTree(2);
        bt.root.left=new Node(3);
        bt.root.right=new Node(5);
        bt.root.left.right=new Node(9);
        bt.root.right.left=new Node(7);

        BinaryTree bt1=new BinaryTree(2);
        bt1.root.left=new Node(3);
        bt1.root.right=new Node(5);
        bt1.root.left.right=new Node(9);
        bt1.root.right.left=new Node(7);
        System.out.println("sameStructure: "+bt.sameStructure(bt.root, bt1.root));

        
    }
}
