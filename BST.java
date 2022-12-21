package tree;

public class BST {
    
     public static void main(String[] args) {
        BST ob =new BST();
        int m[] = {5,2,6,4,1,3,9,7,8};
        Node root=null;
        for(int i : m)
            root=ob.insert(root,i);
        
        ob.inorder(root);
        
        int target=11;
        boolean a=ob.search(root,target);
        System.out.print(a);

    }
     
    public void inorder(Node root)
    {
        if(root == null)
            return ;
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
     public Node insert(Node root,int val)
    {
        if(root == null){
            root=new Node(val);
            return root;
        }
        if(root.data < val)
            root.right=insert(root.right,val);
        else
            root.left=insert(root.left,val);
        return root;
    }
   
    public boolean search(Node root,int tar){
        if(null == root)
            return false;
        if(root.data == tar)
            return true;
        if(root.data >= tar)
            return search(root.left,tar);
        else
            return search(root.right,tar);
     }
}
