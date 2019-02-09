import java.util.*;
public class Gems{
	public stati void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,t,sumo,sume;
		t=sc.nextInt();
		while(t>0)
		{
			t=t-1;
			n=sc.nextInt();
			int[] array=new int[n];
			for(int i=0;i<n;i++){
				array[i]=sc.nextInt();
				if(i%2==0){
					sumo=sumo+array[i];
				}
				else{
					sume=sume+array[i];
				}
			}
		}
	}
}