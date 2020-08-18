import java.util.*;
public class deleteBinarySearchTree
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
    static node delete(node root,int n){
        int temp;
        if(root==null){
            System.out.println("No such element present");
        }
        else if(n<root.data){
            root.left=delete(root.left,n);
        }
        else if(n>root.data){
            root.right=delete(root.right,n);
        }
        else{
            if(root.left!=null && root.right!=null){
                max=0;
                temp=findMax(root.left);
                root.data=temp;
                root.left=delete(root.left,temp);
            }
            else{
                if(root.left==null)
                    root=root.right;
                else if(root.right==null)
                    root=root.left;
                //else
                    //root=null;
            }
        }
        return root;
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
        tree =new node(4);
        tree.left = new node(2); 
        tree.right = new node(6); 
        tree.left.left = new node(1); 
        tree.left.right = new node(3);
        tree.right.left = new node(5); 
        tree.right.right = new node(7);
        levelOrder(tree);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to be deleted");
        int n=in.nextInt();
        tree=delete(tree,n);
        levelOrder(tree);
    }
}