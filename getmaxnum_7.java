package mindtree;
import java.util.Scanner;
public class getmaxnum_7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input 3 numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int res=getMax(num1,num2,num3);
		System.out.println("greatest number among 3 numbers is :"+ res);
	}
	static int getMax(int a,int b,int c)
	{
		int temp=a>b?a:b;
		temp=temp>c?temp:c;
		return temp;	
	}
}