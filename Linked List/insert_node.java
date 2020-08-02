import java.util.*;
public class insert_node
{
    static class node{
        int data;
        node next;
    }
    
    static node insert(int item,node root)
    {
        node t=new node();
        node a;
        t.data=item;
        t.next=null;
        if(root==null)
        {
            root=t;
        }
        else{
            a=root;
            while(a.next!=null){
                a=a.next;
            }   
            a.next=t;
        }
        return root;
    }
    
    static void display(node root){
        while(root!=null){
            System.out.println(root.data);
            root=root.next;
        }
    }
    
    public static void main(String args[]){
        int a;
        Scanner in = new Scanner(System.in);
        node root = null;
        for(int i=0;i<5;i++){
            a=in.nextInt();
            root = insert(a,root);
        }        
        display(root);
        
    }
    
} 