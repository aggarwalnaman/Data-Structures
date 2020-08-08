import java.util.*;
public class search_linkedList
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
    
    static void find(node head,int n){
        node cur=head;
        int c=0;
        while(cur!=null){
            if(cur.data==n)
                break;
            cur=cur.next;
            c++;
        }
        if(cur==null){
            System.out.println("Not Found");
        }
        else
            System.out.println("Found at "+c+" position");
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
        System.out.println("Enter number to be searched");
        int n=in.nextInt();
        find(root,n);
    }
    
} 