package mindtree;
import java.util.Scanner;
public class stu_pwd_18 
{public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter FullName Without any spaces like ShwethaJoshi");
		String name=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		int len=name.length();
		char[] ch=new char[len];
		char[] chcount=new char[len];
		int j=0;
		for(int i=0;i<len;i++)
			ch[i]=name.charAt(i);
		for(int i=0;i<len;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				chcount[j++]=ch[i];
				}
			}
		System.out.println("Your Password is   ");
		for(int i=0;i<j;i++)
		System.out.print(chcount[i]);
		System.out.print(age);	
	}
}