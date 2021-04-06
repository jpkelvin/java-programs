import java.util.*;
public class bellmanFord {
	static int i,j,k,n,s,d[],MAX_VALUE=999,a[][];
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in); 
		System.out.println("Enter the no of vertices");
		n=in.nextInt();
		a=new int[n+1][n+1];
		System.out.println("Enter the adjacency matrix");
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++)
			{
				a[i][j]=in.nextInt();
				if(a[i][j]==0)
					a[i][j]=MAX_VALUE;
			}
		}
		System.out.println("Enter the source vertex");
		s=in.nextInt();
		bellmanFord b= new bellmanFord();
		b.evaluate(s,a);
		in.close();
	}
	private void evaluate(int s, int[][] a) {
		d=new int[n+1];
		for(i=1;i<=n;i++)
			d[i]=MAX_VALUE;
		d[s]=0;
		for(i=1;i<=n-1;i++)
			for(j=1;j<=n;j++)
				for(k=1;k<=n;k++)
				{
					if(a[j][k]!=MAX_VALUE)
						if(d[k]>d[j]+a[j][k])
							d[k]=d[j]+a[j][k];
				}
		for(j=1;j<=n;j++)
			for(k=1;k<=n;k++)
			{
				if(a[j][k]!=MAX_VALUE)
					if(d[k]>d[k]+a[j][k])
						System.out.println("The graph has negative edge");
			}
		for(i=1;i<=n;i++)
			System.out.println("Distance from source "+s+" to "+i+" is "+d[i]);
	}

}
