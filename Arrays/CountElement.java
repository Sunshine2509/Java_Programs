import java.util.*;
class CountElement
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		 int arr[]=new int [size];
		 System.out.println("Enter the elements:");
		 for(int i=0;i<size;i++)
		 {
		 	arr[i]=sc.nextInt();
		 }
		 System.out.println("Enter Element which you want to count:");
		 int element=sc.nextInt();
		 int count=0;
		 for(int i=0;i<size;i++)
		 {
		 	if(arr[i]==element)
		 	{
		 		count++;
		 	}
		 }
		 System.out.println("Total Elements in array are: "+count);


	}
}