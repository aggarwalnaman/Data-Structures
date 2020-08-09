import java.util.*;
public class Insert_Del_in_LinkedList{
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data = d;
            next=null;
            prev=null;
        }
    }
    static Node insert(int d,Node root){
        Node t = new Node(d);
        Node a;
        if(root==null){
            root=t;
        }
        else{
            a=root;
            while(a.next!=null){
                a=a.next;
            }
            a.next=t;
            t.prev=a;
        }
        return root;
    }
    static void display(Node root){
        while(root!=null){
            System.out.print(root.data+" ");
            root=root.next;
        }
        
    }
    
    public static void main(String args[]){
        int a,n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length of list");
        n=in.nextInt();
        Node root = null;
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            a=in.nextInt();
            root = insert(a,root);
        } 
        System.out.println("Enter number of operations : ");
        int k12=in.nextInt();
        while(k12!=0){
            System.out.println("Enter Insert or Delete ");
            String s=in.next();
            if(s.equals("Insert")){
                int pos,val;
                pos=in.nextInt();
                val=in.nextInt();
                Node t=root;
                Node n1=new Node(val);
                if(pos==0){
                    n1.next=root;
                    n1.prev=null;
                    root=n1;
                    k12--;
                    continue;
                }
                while((--pos)!=0){
                    t=t.next;
                }
                if(t.next!=null){
                    n1.prev=t;
                    n1.next=t.next;
                    t.next.prev=n1;
                    t.next=n1;
                }
                else{
                    insert(val,root);
                }
            }
            else if(s.equals("Delete")){
                int d=in.nextInt();
                Node t=root;
                while(d!=0){
                    t=t.next;
                    d--;
                }
                if(t.next==null){
                    t.prev.next=null;
                }
                else if(t==root){
                    root=root.next;
                }
                else{
                    t.prev.next=t.next;
                    t.next.prev=t.prev;
                }
            }
            
            k12--;
        }
        display(root);
        
    }
    
} 