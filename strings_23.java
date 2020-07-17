package mindtree;
import java.util.Scanner;
public class strings_23 {
		static void Comp(String s) 
		{ 
			for (int i = 0; i < s.length(); i++) 
				{ 
				int count = 1; 
				while ((i+1<s.length()&&(s.charAt(i)==(s.charAt(i+1)-32)||s.charAt(i)==(s.charAt(i+1)+32))||(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)))) { 
					i++; 
					count++; 
				}
				System.out.print(s.charAt(i)+" "+count+" "); 
			} 
			System.out.println(); 
		}
		public static void main(String args[]) 
		{ 
			Scanner obj= new Scanner(System.in);
			String a=obj.next();
			int len=a.length();
			char[]use=new char[len];
			for(int i=0;i<len;i++)
				use[i]=a.charAt(i);
			for(int i=0;i<len;i++)
			if(use[i]>='A' && use[i]<='Z')
	        { 
				use[i]=(char)((int)use[i]+32);
	        }
			String str = String.valueOf(use);
			Comp(str);
			obj.close();
	}
}
