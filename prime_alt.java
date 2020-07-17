package mindtree;
import java.util.Scanner;
public class prime_alt
{
	public static void main(String[] args)
	{ 
		long a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLong();
		System.out.println (IsPrime(a));
	}
	static boolean IsPrime(long a)
	{ 
		long m=a/2; 
		if(a==0 || a==1) 
			return false; 
		for(long i=2;i<=m;i++) {
			if((a%i)==0){
				return false;	
			}
	}
		 return true;
	}
}