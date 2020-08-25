import java.util.*;

public class binarySearch {
    static void search(int a[],int s){
        int l,u;
        l=0;
        u=a.length-1;
        int m=(l+u)/2;
        while(l<=u){
            m=(l+u)/2;
            if(a[m]==s){       
                System.out.println("Search Successful");
                return;
            }
            else if(a[m]>s){
                u=m-1;
            }
            else{
                l=m+1;
            }
        }
        System.out.println("Search Unsuccessful");
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the element to be serched");
        int f=in.nextInt();
        Arrays.sort(a);
        search(a,f);
        in.close();
    }
}