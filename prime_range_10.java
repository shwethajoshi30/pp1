package mindtree;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class prime_range_10 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lower and upper range within which you want to check the prime numbers");
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		calc_prime(r1,r2);
	}
	public static void calc_prime(int r1,int r2)
	{
		int flag;
		int arr[]=new int[40],count=0,k=0;
		while(r1<r2)
		{
			flag=0;
		for(int i=2;i<=r1/2;i++)
		{
			if(r1%i==0)
			{
				flag=1;
				break;
			}
		}
			if(flag==0 && (r1>1))
			{
				arr[k]=r1;
				k++;
				count++;	  
			}	
			r1++;
			}
		for(int i=0;i<count;i++)
		{
			if(i==count-1)
			{
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i]+",");
			}
		}
	}
}