import java.util.*;
class Route{
	/*char a,d,m,t,l,w,s,r;
		int a1,d1,m1,t1,l1,w1,s1,r1;
		a='A';			//65
		d='D';			//68		
		m='M';		//77
		t='T';		//84
		l='L';		//76
		w='W';		//87
		s='S';		//83
		r='R';		//82
		a1=a;
		d=d1;
		m1=m;
		t1=t;
		l1=l;
		w1=w;
		s1=s;
		r1=r;
		*/
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		char[][] Array=new char[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				Array[i][j]=sc.next().charAt(0);
			}
		}
		if(Array[0][1]=='R'){
		  	routePrint(Array,n,0,1);
		}
		if(Array[1][0]=='R'){
		  	routePrint(Array,n,1,0);
		}
		if(Array[1][1]=='R'){
		  	routePrint(Array,n,1,1);
		}
		System.out.print("DESTINATION");
	}
	public static void routePrint(char Array[][],int n,int i,int j){		
		char[] Store=new char[8];
		Array[i][j]='V';
		int x,y,top=0,exit1=0;
		char temp,temp1,ch;
		for(x=i-1;x<=i+1;x++){
			for(y=j-1;y<=j+1;y++){
					if((x>=0)&&(x<n)){
						if((y>=0)&&(y<n)){
							 ch=Array[x][y]; 
							if((ch=='L')||(ch=='S')||(ch=='T')||(ch=='W')){
								temp=Array[x][y];
								Store[top]= temp;
								top=top+1;
						}
						if(ch=='D'){
							exit1=exit1+1;
						}
					}
				}
			}
		}
		Arrays.sort(Store);
		if(Store.length>=0){
		for(x=0;x<Store.length;x++){
			if(Store[x]>0){
			 temp1=(char)Store[x];
			System.out.print(temp1+" ");
			}
		}
		System.out.println();
		for(x=i-1;x<=i+1;x++){
			for(y=j-1;y<=j+1;y++){
				 if((x>=0)&&(x<n)){
						if((y>=0)&&(y<n)){
							ch=Array[x][y];
							if(ch=='R'){
							routePrint(Array,n,x,y);
							}
						}
					}
			}
		}
		if(exit1==1){
			return;
		}
		}
		else{
			System.out.println("NO HURDLES");
		}
	}
} 