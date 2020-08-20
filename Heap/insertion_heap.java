import java.util.*;
public class insertion_heap{
    static int[] insert(int a[],int n){
        if(a.length==0)
            a[0]=n;
        else{
            int i=a.length-1;
            while(true){
                if(i!=0 && a[(i-1)/2]<n){
                    a[i]=a[(i-1)/2];
                    i=(i-1)/2;
                }
                else{
                    a[i]=n;
                    break;
                }
            }
        }
        return a;
    }
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number of elements");
        int t=in.nextInt();
        System.out.println("Enter elements");
        int[] a = new int[t+1];
        for(int i=0;i<t;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter element to be inserted");
        int n=in.nextInt();
        a=insert(a,n);
        System.out.println("Array after inserting element");
        for(int i=0;i<t;i++){
            System.out.print(a[i]+" ");
        }
    }
}