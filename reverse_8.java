package mindtree;
import java.util.Scanner;
public class reverse_8 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to reverse ");
		int num=sc.nextInt();
		int rev=reverse_order(num);
		System.out.println("Reverse of "+ num + " is : "+ rev);
	}
	public static int reverse_order(int num)
	{
		int temp=num,rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			temp=temp/10;
			rev=rev*10+rem;	
		}
		return rev;
	}
}