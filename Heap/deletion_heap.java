import java.util.*;
public class deletion_heap{
    static int[] delete (int a[]){
        int l=a.length;
        if(a.length==0)
            System.out.println("Array is empty");
        else{
            int i=0;
            a[i]=a[a.length-1];
            //for(int i1=0;i1<a.length-1;i1++){
            //    System.out.print(a[i1]+" ");
            //}
            //System.out.println();
            while(true){
                if((i*2+1)<l && a[i]<a[i*2+1]){
                    int t=a[i];
                    a[i]=a[i*2+1];
                    a[i*2+1]=t;
                    i=i*2+1;
                }
                else if((i*2+2)<l && a[i]<a[i*2+2]){
                    int t=a[i];
                    a[i]=a[i*2+2];
                    a[i*2+2]=t;
                    i=i*2+2;
                }
                else{
                    break;
                }
            //    for(int i1=0;i1<a.length-1;i1++){
            //        System.out.print(a[i1]+" ");
              //  }
              //  System.out.println();
            }
        }
        return a;
    }
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number of elements");
        int t=in.nextInt();
        System.out.println("Enter elements");
        int[] a = new int[t];
        for(int i=0;i<t;i++){
            a[i]=in.nextInt();
        }
        a=delete(a);
        System.out.println("Array after deleting element");
        for(int i=0;i<t-1;i++){
            System.out.print(a[i]+" ");
        }
    }
}