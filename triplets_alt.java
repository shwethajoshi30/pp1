package mindtree;
import java.util.Scanner;
public class triplets_alt {
	public static void main(String[] args) 
	{ 
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Size of array");
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();	
		}
		findTriplets(arr, n);
	}
	static void findTriplets(int[] arr, int n) 
	{ 
		boolean found = true; 
		for (int i=0; i<n-2; i++) 
		{ 
			for (int j=i+1; j<n-1; j++) 
			{ 
				for (int k=j+1; k<n; k++) 
				{ 
					if (arr[i]+arr[j]== arr[k]) 
					{ 
						System.out.print("< ");
						System.out.print(arr[i]+" "); 
						System.out.print(arr[j]+" "); 
						System.out.print(arr[k]+" "); 
						System.out.print(">"); 
						System.out.print("\n"); 
						found = true; 
					} 
				} 
			} 
		} 
	if (found == false) 
			System.out.println(" not exist "); 
	} 
}