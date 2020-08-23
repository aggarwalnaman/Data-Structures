import java.util.*;
public class findMaxInBinaryTree
{
    static int max=0;
    static class node{
        int data;
        node left,right;
        node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    static int findMax(node root){
        if(root==null)
            return max;
        if(root.data>max){
            max=root.data;
        }
        findMax(root.left);
        findMax(root.right);
        return max;
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
        int n=findMax(tree);
        System.out.println(n);
    }
}