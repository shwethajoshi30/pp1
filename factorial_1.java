package mindtree;
import java.util.Scanner;
public class factorial_1
{
	public static int fact(int num) 
		{
			if(num==0||num==1) 
			{
				return 1;
			}
			else
			return num*fact(num-1);
		}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int number,res;
			System.out.println("enter the number");
			number=sc.nextInt();
			res=fact(number);
			System.out.println("factorial of " + number + " is : "+ res);
		}	
}