package mindtree;
public class bubblesort_12
{
	public static void main(String[] args) 
	{
			int arr[]= {5,1,4,2,8};
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=1;j<arr.length-i;i++)
				{
					if(arr[j-1]>arr[j])
					{
						int temp=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++) 
				System.out.print(arr[i] +" ");
	}
}