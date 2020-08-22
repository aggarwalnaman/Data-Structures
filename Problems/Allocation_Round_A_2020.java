import java.util.*;
public class Allocation_Round_A_2020{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        int t1=in.nextInt(),k=1;
        while(t1--!=0){
            int n=in.nextInt();
            int t=in.nextInt();
            int[] a = new int[n];
            int s=0,c=0;
            for(int i=0;i<n;i++)
                a[i]=in.nextInt();
            Arrays.sort(a);
            int i;
            for(i=0;i<n;i++){
                s=s+a[i];
                if(s>t){
                    break;
                }
            }
            // if(c==n)
            //     System.out.println("Case #"+k+": "+(c));
            // else
                System.out.println("Case #"+k+": "+i);
            k++;
        }
    }
}