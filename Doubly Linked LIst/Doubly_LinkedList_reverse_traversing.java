import java.util.*;
public class Doubly_LinkedList_reverse_traversing{
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
        while(root.next!=null){
            root=root.next;
        }
        while(root!=null){
            System.out.println(root.data);
            root=root.prev;
        }
    }
    
    public static void main(String args[]){
        int a;
        Scanner in = new Scanner(System.in);
        Node root = null;
        for(int i=0;i<5;i++){
            a=in.nextInt();
            root = insert(a,root);
        }   
        System.out.println("Reverse order");
        display(root);
        
    }
    
} 