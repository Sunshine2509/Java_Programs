import java.util.*;
class CheckPalindromeArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();


		System.out.println("Enter Elements :");
		char arr[]=new char[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next().charAt(0);

		}
		char revArray[]=new char[size];
		int temp=0;
		for(int i=size-1;i>=0;i--)
		{
			revArray[temp++]=arr[i];

		}
		if(Arrays.equals(arr,revArray))
		{
			System.out.println("It is an palindrome array");
		}
		else {
			System.out.println("Not palindrome array");
		}
		System.out.println(Arrays.toString(arr));
		
	}
}