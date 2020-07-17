package mindtree;
import java.util.StringTokenizer;
public class reverse_str_22 {
	public static void main(String[] args) {
		String str="1 cup of hot coffee costs 8.00, whereas cold coffee costs 45.00";
		String delim=" ";
		StringTokenizer st=new StringTokenizer(str,delim);
		String result="";
		int len=st.countTokens();
		String arrofstr[]=new String[st.countTokens()];
		int p=0;
		while(st.hasMoreElements())
		{
			arrofstr[p++]=st.nextToken();
		}
		String reverse="";
		for(int i=0;i<arrofstr.length;i++)
		{
			if(arrofstr[i].charAt(0)>=65 && arrofstr[i].charAt(0)<=122)
			{
				
				String ch=arrofstr[i];
				for(int j=ch.length()-1;j>=0;j--)
				{
					reverse=reverse+ch.charAt(j);	
				}
				System.out.print(reverse+" ");
				reverse="";
			}
			else
			{
				System.out.print(arrofstr[i]+" ");
			}
		}
		

	}

}
