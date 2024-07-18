import java.util.*;
class AscendingOrder
{
	public static void main(String[] args) {

		// Way 1

		// Scanner sc=new Scanner(System.in);

		// System.out.println("Enter the array size:");
		// int size = sc.nextInt();
		//  int arr[]=new int [size];
		//  System.out.println("Enter the elements:");
		//  for(int i=0;i<size;i++)
		//  {
		//  	arr[i]=sc.nextInt();
		//  }
		//  System.out.println(Arrays.toString(arr));
		 
		//  for(int i=0;i<size-1;i++)
		//  {
		//  	for(int j=0;j<size-1-i;j++)
		//  	{
		//  		if(arr[j]>arr[j+1])
		//  		{
		//  			//swapping
		//  			int temp=arr[j];
		//  			arr[j]=arr[j+1];
		//  			arr[j+1]=temp;
		 			
		//  		}
		//  	}
		//  	}
		//  	System.out.println(Arrays.toString(arr));

		// Way 2

		int arr[] = {9,3,1,2,11,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		 }
		 for(int i=0;i<arr.length;i++)
		 {
		 	System.out.print(arr[i] +" ");
		 }
		 }
	}
