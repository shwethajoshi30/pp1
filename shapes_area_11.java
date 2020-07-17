package mindtree;
import java.util.Scanner;
public class shapes_area_11
{
	public static void main(String[] args)
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println(" 1.triangle\n 2.square\n 3.rectangle\n 4.circle\n 5.exit");
		System.out.println("choose shape for which you want to calculate area");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1 	:System.out.println("enter side of triangle:");
						int t_side=sc.nextInt();
						System.out.println("enter height of triangle:");
						int t_height=sc.nextInt();
						System.out.println((float)(t_side * t_height)/2);
						break;
		case 2	:System.out.println("enter side of square:");
						int s_side=sc.nextInt();
						System.out.println( s_side *s_side);
						break;
		case 3	:System.out.println("enter width of rectangle:");
						int r_width=sc.nextInt();
						System.out.println("enter height of rectangle:");
						int r_height=sc.nextInt();
						System.out.println(r_width * r_height);
						break;
		case 4	:System.out.println("enter radius of circle:");
						int c_radius=sc.nextInt();
						System.out.println(Math.PI*c_radius*c_radius);
						break;
		case 5:System.exit(0);
		}
		}while(ch!=5);
	}
}