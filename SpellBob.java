import java.util.*;
 class SpellBob{
	public static void main(String args[]){
	String first="";
	String second="";
	int t;
	String display="";
	Scanner sc=new Scanner(System.in);
	t=sc.nextInt();
	for(int j=0;j<t;j++){
			first=sc.next();
			second=sc.next();
			display=Checkfun(first,second);
			System.out.println(display);
		}
	}
	public static String Checkfun(String fir,String sec){
		String s3;
		String checker="bob"; 
		String check="";
		s3=fir.concat(sec);
		int l,ptr=0,count=0;
		char[] ch=s3.toCharArray();
		l=s3.length();
		for(int i=0;i<l;i++){
			if(ch[i]=='b'){
				//check=check.concat(ch[i]);
				check=check+ch[i];
				count=count+1;
				ptr=i;
			}
			if(ch[i]=='o'){
				check=check+ch[i];
				//count=count+1;
			}
			if(count==2){
				if(checker.equals(check)){
					return "yes";
				}
				else{
					i=ptr-1;
					check="";
					count=0;
				}
			}
		}
		return "no";
	}
}