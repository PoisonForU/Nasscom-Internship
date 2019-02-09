t=n;
while(n>0){
	x=(Math.pow(n, 1/k));
	x=Math.abs(x);
	sum=sum+(Math.pow(x, k));
	n=n-x;
	if(sum==t){
		count=count+1;
		break;
	}
}