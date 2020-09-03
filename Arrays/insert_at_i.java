import java.util.*;
public class insert_at_i
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int size;
        System.out.println("Enter size of array");
        size=in.nextInt();
        int a[]=new int[size+1];
        System.out.println("Enter array");
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter element to be inserted and pos:");
        int n=in.nextInt();
        int p=in.nextInt();
        for(int i=size;i>p;i--){
            a[i]=a[i-1];
        }
        a[p]=n;
        System.out.println("Array:");
        for(int i=0;i<=size;i++){
            System.out.println(a[i]);
        }
        in.close();
    }
}