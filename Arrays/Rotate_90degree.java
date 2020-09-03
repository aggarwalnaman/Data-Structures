import java.util.*;
public class Rotate_90degree{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[][]=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
        int t=0;
		for(int i=0;i<n/2;i++)
		{	
			for(int j=i;j<n-i-1;j++){	
				t=a[i][j];
				a[i][j]=a[n-j-1][i];
				a[n-j-1][i]=a[n-i-1][n-j-1];
				a[n-i-1][n-j-1]=a[j][n-i-1];
				a[j][n-i-1]=t;
			}
		}
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
         System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    in.close();
  }
}
