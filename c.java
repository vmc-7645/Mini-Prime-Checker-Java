import java.util.*;
class c{
	public static void main(String[] args){
		for(int n=1;n!=0;n=new Scanner(System.in).nextInt())
			System.out.print((p(n)!=0)+"\n:");//Input int, 0 ends
	}
	static int p(int n){
		for(int i=2;i<=n/2;i++)
			if(n%i==0)
				return 0;
		return 1;	
	}
}
