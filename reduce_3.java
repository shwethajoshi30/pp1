package mindtree;

public class reduce_3 {

	public static void main(String[] args) 
	{
		int k=0,n=14,temp ;
		while(n!=1)
		{
			k++;
			if(n%2!=0)
			{
				System.out.println(n +" is odd so I make 3n+1 :"+ ((n*3)+1));
				temp=(n*3)+1;	
			}
			else
			{
				System.out.println(n +" is even so I take half :" + (n/2));
				temp=n/2;
			}
			n=temp;
		}
		System.out.println("There are total "+ k + " steps to reach 1");

	}

}
