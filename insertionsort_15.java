package mindtree;
import java.util.*;
public class insertionsort_15 {
	public static void main(String[] args) {
		int[] nums= {85,12,59,45,72,51};
		i_sort(nums);
	}
	private static void i_sort(int[] nums) {
		for(int i=1;i<nums.length;i++)
		{
			int value=nums[i];//12
			int j=i-1;//0
			while(j>=0 && nums[j]>value)
			{
				nums[j+1]=nums[j];//1 12
				j=j-1;
			}
			nums[j+1]=value;
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]+" ");
		}
	}
}