//1.Java program for the Tree Tranversal of Preorder , Inorder and Postorder Tranversal separately
//1.1 PostOrder

// import java.util.*;
// class TreeNode{
//     int value;
//     TreeNode left,right;
//     TreeNode(int value){
//         this.value=value;
//         left=right=null;

//     }
// }
// public class TreeTraversal{
//     public void postorder(TreeNode node){
//         if(node==null)
//         return;
//         postorder(node.left);
//         postorder(node.right);
//         System.out.print(node.value+" ");
//     } 

//     public static void main(String[] args)
//     {
//     TreeNode root=new TreeNode(1);
//     root.left=new TreeNode(2);
//     root.right=new TreeNode(3);
//     root.left.left= new TreeNode(4);
//     root.left.right= new TreeNode(5);
//     TreeTraversal tree=new TreeTraversal();
//     System.out.print("Postorder traversal:");
//     tree.postorder(root);
// }
// }


// 1.2 Preorder

// import java.util.*;
// class TreeNode{
//     int value;
//     TreeNode left,right;
//     TreeNode(int value){
//         this.value=value;
//         left=right=null;

//     }
// }
// public class TreeTraversal{
//     public void pretorder(TreeNode node){
//         if(node==null)
//         return;
//         System.out.print(node.value+" ");
//         preorder(node.left);
//         preorder(node.right);
//     } 

//     public static void main(String[] args)
//     {
//     TreeNode root=new TreeNode(1);
//     root.left=new TreeNode(2);
//     root.right=new TreeNode(3);
//     root.left.left= new TreeNode(4);
//     root.left.right= new TreeNode(5);
//     TreeTraversal tree=new TreeTraversal();
//     System.out.print("Preorder traversal:");
//     tree.preorder(root);
// }
// }

// 1.3 Inorder traversal

// import java.util.*;
// public class TreeNode{
//     int value;
//     TreeNode left,right;
//     TreeNode(int value){
//         this.value=value;
//         left=right=null;

//     }
// }
// class TreeTraversal{
//     public void inorder(TreeNode node){
//         if(node==null)
//         return;
//         inorder(node.left);
//         System.out.print(node.value+" ");
//         inorder(node.right);

//     } 

// public static void main(String[] args)
// {
//     TreeNode root=new TreeNode(1);
//     root.left=new TreeNode(2);
//     root.right=new TreeNode(3);
//     root.left.left= new TreeNode(4);
//     root.left.right= new TreeNode(5);
//     TreeTraversal tree=new TreeTraversal();
    // System.out.print("inorder traversal:");
    // tree.inorder(root);

// }
// }


// 2. Java program for the Tree Tranversal of Preorder , Inorder and Postorder Tranversal

// import java.util.*;
// public class TreeNode{
//     int value;
//     TreeNode left,right;
//     TreeNode(int value){
//         this.value=value;
//         left=right=null;

//     }
// }
// class TreeTraversal{
//     public void preorder(TreeNode node){
//         if(node==null)
//         return;
//         System.out.print(node.value+" ");
//         preorder(node.left);
//         preorder(node.right);

//     } 
//     public void inorder(TreeNode node){
//         if(node==null)
//         return;
//         inorder(node.left);
//         System.out.print(node.value+" ");
//         inorder(node.right);
        
//     } 
//     public void postorder(TreeNode node){
//         if(node==null)
//         return;
//         postorder(node.left);
//         postorder(node.right);
//         System.out.print(node.value+" ");
//     } 
// public static void main(String[] args)
// {
//     TreeNode root=new TreeNode(1);
//     root.left=new TreeNode(2);
//     root.right=new TreeNode(3);
//     root.left.left= new TreeNode(4);
//     root.left.right= new TreeNode(5);
//     root.right.left=new TreeNode(6);
//     root.right.right=new TreeNode(7);
//     root.left.right.left=new TreeNode(8);
//     root.right.right.left=new TreeNode(9);
//     root.right.right.right=new TreeNode(10);
//     TreeTraversal tree=new TreeTraversal();
//     System.out.print("Preorder traversal:");
//     tree.preorder(root);
//     System.out.print("\ninorder traversal:");
//     tree.inorder(root);
//     System.out.print("\nPostorder traversal:");
//     tree.postorder(root);
// }
// }


// 3.Java program for the Tree Tranversal of Preorder , Inorder and Postorder Tranversal

// import java.util.*;
// public class TreeNode{
//     int value;
//     TreeNode left,right;
//     TreeNode(int value){
//         this.value=value;
//         left=right=null;

//     }
// }
// class TreeTraversal{
//     public void preorder(TreeNode node){
//         if(node==null)
//         return;
//         System.out.print(node.value+" ");
//         preorder(node.left);
//         preorder(node.right);

//     } 
//     public void inorder(TreeNode node){
//         if(node==null)
//         return;
//         inorder(node.left);
//         System.out.print(node.value+" ");
//         inorder(node.right);
        
//     } 
//     public void postorder(TreeNode node){
//         if(node==null)
//         return;
//         postorder(node.left);
//         postorder(node.right);
//         System.out.print(node.value+" ");
//     } 
        

// public static void main(String[] args)
// {
//     TreeNode root=new TreeNode(4);
//     root.left=new TreeNode(2);
//     root.right=new TreeNode(5);
//     root.left.left= new TreeNode(3);
//     root.right.right=new TreeNode(6);
//     root.right.left=new TreeNode(7);
//     root.left.left.right=new TreeNode(9);
//     root.right.right.left=new TreeNode(8);
//     root.left.left.right.left=new TreeNode(1);
//     TreeTraversal tree=new TreeTraversal();
//     System.out.print("Preorder traversal:");
//     tree.preorder(root);
//     System.out.print("\ninorder traversal:");
//     tree.inorder(root);
//     System.out.print("\nPostorder traversal:");
//     tree.postorder(root);
// }
// }


// 4.Java program for the Tree Tranversal of Preorder , Inorder and Postorder Tranversal

import java.util.*;
public class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
        this.value=value;
        left=right=null;

    }
}
class TreeTraversal{
    public void preorder(TreeNode node){
        if(node==null)
        return;
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);

    } 
    public void inorder(TreeNode node){
        if(node==null)
        return;
        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);
    } 
    public void postorder(TreeNode node){
        if(node==null)
        return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");
    } 

public static void main(String[] args)
{
    TreeNode root=new TreeNode(1);
    root.left=new TreeNode(2);
    root.left.left=new TreeNode(7);
    root.left.right=new TreeNode(8);
    root.left.left.left=new TreeNode(9);
    root.right=new TreeNode(3);
    root.right.right=new TreeNode(4);
    root.right.right.left=new TreeNode(5);
    root.right.right.left.right=new TreeNode(6);

    TreeTraversal tree=new TreeTraversal();
    System.out.println("Preorder Traversal:");
    tree.preorder(root);
    System.out.println("\nInorder Traversal:");
    tree.inorder(root);
    System.out.println("\nPostorder Traversal:");
    tree.postorder(root);
}
}