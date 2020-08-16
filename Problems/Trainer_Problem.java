import java.util.*;
class Trainer_Problem{
 public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int t1=in.nextInt();
    int l=0,p=0,ans=2147483647,x=1;
    while(t1!=0){
        l=in.nextInt();
        p=in.nextInt();
        ans=2147483647;
        int[] a=new int[l];
        for(int i=0;i<l;i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        int[] na=new int[l];
        na[0]=a[0];
        for(int i=0;i<l-1;i++){
            na[i+1]=na[i]+a[i+1];
            
        }
        for(int i=0;i<l;i++){
            System.out.print(na[i]+" ");
        }
        for(int i=p-1;i<l;i++){
            int s=0;
            if(i-p>=0)
                s=a[i]*p-na[i]+na[i-p];
            else
                s=a[i]*p-na[i];
            
            
            if(s==0){
                ans=0;
                break;
            }
            if(ans>s){
                ans=s;
            }
        }
        System.out.println("Case #"+x+": "+ans);
        x++;
        t1--;
    }
    
}
}