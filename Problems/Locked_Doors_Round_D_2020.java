import java.util.*;
class Locked_Doors_Round_D_2020{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int tc11=in.nextInt();
        for(int tc12=1;tc12<=tc11;tc12++){
            System.out.print("Case #"+tc12+":");
            int n=in.nextInt();
            int q=in.nextInt();
            int[] a=new int[n-1];
            for(int i=0;i<n-1;i++){
                a[i]=in.nextInt();
            }
            for(int tc=0;tc<q;tc++){
                int s=in.nextInt();
                int k=in.nextInt();
                int nr,pr;
                s--;
                nr=(s==n-1)?-1:s+1;
                pr=(s==0)?-1:s-1;
                for(int i=0;i<k-1;i++){
                    if(nr==-1){
                        s=pr;
                        pr=(s==0)?-1:pr-1;
                    }
                    else if(pr==-1){
                        s=nr;
                        nr=(s==n-1)?-1:nr+1;
                    }
                    else if(a[pr]<a[nr-1]){
                        s=pr;
                        pr=(s==0)?-1:pr-1;
                    }
                    else if(a[nr-1]<a[pr]){
                        s=nr;
                        nr=(s==n-1)?-1:nr+1;
                    }
                }
                s++;
                System.out.print(" "+s);
            }
            System.out.println();
        }
    }
}