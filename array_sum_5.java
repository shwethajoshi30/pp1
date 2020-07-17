package mindtree;
import java.util.ArrayList;
public class array_sum_5 {
		public static void main(String[] args)
		{
				double arr1[]={10.0,20.0,30.0};
				double arr2[]={20.0,50.0,30.0,70.0,80.0};
				int size1,size2;
				size1=arr1.length;//3
				size2=arr2.length;//5
				if(size1>size2) 
				{
					double c[]= new double[size1];
					for(int i=0;i<size1;i++)
					{
						c[i]=arr1[i];
					}
					for(int i=0;i<size2;i++)
					{
						c[i]=c[i]+arr2[i];
					}
					for(int i=0;i<size1;i++)
					{
						System.out.print(Math.round(c[i])+" ");
					}
				}
				else
				{
					double c[]= new double[size2];
					for(int i=0;i<size2;i++)
					{
						c[i]=arr2[i];
					}
					for(int i=0;i<size1;i++)
					{
						c[i]=c[i]+arr1[i];
					}
					for(int i=0;i<size2;i++)
					{
						System.out.print(Math.round(c[i])+" ");
					}
				}
}
}