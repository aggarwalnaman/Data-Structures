import java.util.*;
import java.util.stream.IntStream; 
public class FindTreeHeight{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        List<Integer> a = new ArrayList<>(t);
        List<Integer> n = new ArrayList<>(t);
        List<Integer> c = new ArrayList<>(t);
        int h=1;
        for(int i=0;i<t;i++){
            a.add(in.nextInt());
            n.add(-5);
            c.add(0);
        }
        n.set(0,0);
      
        for(int i=0;i<t;i++){
            if(a.get(i)==-1){
                n.set(0,i);
                break;
            }
        }
        for(int i=0;i<t;i++){
            int k=0;
            for(int j=0;j<t;j++){
                int l=a.get(j);
                if(n.contains(l) ){
                    c.set(k,j);
                    
                     //System.out.print(c.get(k)+" ");
                     k++;
                    }
            }
            for(int j=0;j<t;j++){
                if(j<k){
                    n.set(j, c.get(j));
                   
                }
                else
                    n.set(j, -5);
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
        
    }
}