import java.util.*;

public class linearSearch {
    static void search(int a[],int s){
        for(int i=0;i<a.length;i++){
            if(a[i]==s){       
                System.out.println("Search Successful");
                return;
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
        search(a,f);
        in.close();
    }
}