public class insertion_Binary_Search_Tree
{
    class node{
        int data;
        node left;
        node right;
    }
    void insert(node root,int val){
        node n = new node();
        node t;
        n.data=val;
        n.left=null;
        n.right=null;
        if(root==null){
            root=n;
        }
        else{
            t=root;
            while(t!=null){
                if(t.data>val){
                    if(t.left==null)
                        t.left=n;
                    t=t.left;
                }
                else if(t.data<val){
                    if(t.right==null)
                        t.right=n;
                    t=t.right;
                }
            }
        }
    }
}