import java.util.*;
import java.util.stream.IntStream; 
public class FindTreeHeight{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[] a=new int[t];
        int[] n= new int[t];
        int[] c= new int[t];
        int h=1;
        for(int i=0;i<t;i++){
            a[i]=in.nextInt();
            n[i]=-5;
        }
        n[0]=0;
        for(int i=0;i<t;i++){
            if(a[i]==-1){
                n[0]=i;
                break;
            }
        }
        for(int i=0;i<t;i++){
            int k=0;
            for(int j=0;j<t;j++){
                int l=a[j];
                if(IntStream.of(n).anyMatch(x -> x == l) ){
                    c[k]=j;
                    k++;
                    // System.out.print(j+" ");
                }
            }
            for(int j=0;j<t;j++){
                if(j<k){
                    n[j]=c[j];
                    System.out.print(n[j]+" ");
                }
                else
                    n[j]=-5;
            }
            System.out.println();
            if(k>0){
                h++;
            }
            else{
                break;
            }
        }
        System.out.println(h);
        in.close();
    }
}