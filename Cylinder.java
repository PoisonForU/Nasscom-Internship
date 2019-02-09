import java.util.*;

public class Cylinder{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int r,h,s,d,angle,x,dis;
		double rad,temp;
		r=sc.nextInt();
		h=sc.nextInt();
		s=sc.nextInt();
		d=sc.nextInt();
		angle=sc.nextInt();
		rad= Math.toRadians(angle);
		x=s-d;
		if(x<0){
			x=x*(-1);
		}
		if(d>=0){
			temp=r*rad+x;
			dis=(int)temp;
		}
		else{
			dis=s+r+d*(-1);
			
		}
		System.out.println(dis);
	}
}