import java.util.*;
public class level_order_binary_traversal
{
    static class node{
        int data;
        node left,right;
        node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    static void levelOrder(node root){
        int h=height(root);
        for(int i=1;i<=h;i++){
            printLevel(root,i);
            System.out.println();
        }
    }
    static int height(node root){
        if(root==null)
            return 0;
        else{
            int l=height(root.left);
            int r=height(root.right);
            
            if(l>r)
                return l+1;
            else
                return r+1;
        }
    }
    static void printLevel(node root,int l){
        if(l==0)
            return;
        else if(l==1)
            System.out.print(root.data+" ");
        else{
            if(root.left!=null)
            printLevel(root.left,l-1);
            System.out.print(" ");
            if(root.right!=null)
            printLevel(root.right,l-1);
            System.out.print("   ");
        }
    }
    public static void main(String args[]){
        node tree;
        tree =new node(1);
        tree.left = new node(2); 
        tree.right = new node(3); 
        tree.left.left = new node(4); 
        tree.left.right = new node(5);
        tree.right.left = new node(6); 
        tree.right.right = new node(7);
        levelOrder(tree);
    }
}