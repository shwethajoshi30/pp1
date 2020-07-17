package mindtree;
import java.util.Scanner;
public class prime_9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		long num=sc.nextLong();
		boolean res=isPrime(num);
		System.out.println(res);
	}
	public static boolean isPrime(long num)
	{
		boolean flag=false;
		if(num==0 || num==1)
		{
			return false;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			return true;
		}
		else
			return flag;
	}
}