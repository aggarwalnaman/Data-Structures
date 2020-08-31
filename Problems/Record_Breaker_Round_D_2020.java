import java.util.*;
class Record_Breaker_Round_D_2020{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j1=1;j1<=t;j1++){
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            int max=0,c=0;
            if(n==1){
                System.out.println("Case #"+j1+": 1");
                continue;
            }
            for(int i=0;i<n-1;i++){
                if(a[i]>max && a[i]>a[i+1]){
                    max=a[i];
                    c++;
                }
            }
            if(a[n-1]>max && a[n-1]!=a[n-2])
                c++;
            System.out.println("Case #"+j1+": "+c);
            
        }
    }
}