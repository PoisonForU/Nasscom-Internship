import java.util.*;
public class Polygon
{
	public static void main(String args[]){
  int n;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int[] a=new int[n];
  int sum=0;
  for(int i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
    sum+=a[i];
  }
  int c=0;
  Arrays.sort(a);
  if(n>2)
  {
    int pre=a[0];
    for(int i=1;i<n-1;i++)
    {  pre+=a[i];
       sum=pre;
      for(int j=i+1;j<n;j++)
      {
          if(sum>a[j])
          {
             c=i+2;
     }
          sum-=a[j-i-1];
          sum+=a[j];
      }
    }
}
    System.out.print(c);
	}
}
