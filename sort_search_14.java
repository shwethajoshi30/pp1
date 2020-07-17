package mindtree;
import java.util.Scanner;
public class sort_search_14 {
public static void main(String[] args) {
		int arr[]= {2,3,4,8,9};
		String names[]= new String[]{"john","Leo","rosey"};
		int key=4;
		String name="Leo";
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.binary search for integers \n2.binary search for strings \n3.exit \n");
			System.out.println("enter choice...");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println(findElement(arr,key));break;
			case 2:System.out.println(findString(names,name));break;
			case 3:System.exit(0);
			}
		}while(ch!=3);
}
	public static boolean findElement(int arr[],int key)
	{
		int l=0,r=arr.length-1,mid;
		while(l<=r)
		{
			mid=(l+r)/2;
			if(arr[mid]==key)
				return true;
			if(arr[mid]<key)
			{
				l=mid+1;
			}
			else
				r=mid-1;
		}
		return false;
	}
	public static boolean findString(String names[],String name)
	{
		int l=0,r=names.length-1,mid;
		while(l<=r)
		{
			mid=(l+r)/2;
			int found=name.compareTo(names[mid]);
			if(found==1)
				 return true;
			if(found>0)
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
		}
		return false;
	}
}