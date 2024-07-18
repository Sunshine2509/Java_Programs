import java.util.*;
class MergeTwoArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size for Array1");
		int size1=sc.nextInt();
		System.out.println("Enter size for Array2");
		int size2=sc.nextInt();
		System.out.println("Enter the array elements");

		int arr1[]=new int [size1];
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int [size2];
		for(int j=0;j<size2;j++)
		{
			arr2[j]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		 System.out.println(Arrays.toString(arr2));

		 int mergeArraySize=size1+size2;

		 int mergeArray[]=new int [mergeArraySize];

		 for(int i=0;i<size1;i++)
		 {
		 	mergeArray[i]=arr1[i];
		 }

		 for(int j=0;j<size2;j++)
		 {
		 	mergeArray[size1+j]=arr2[j];
		 }
		 System.out.println(Arrays.toString(mergeArray));
		 
	}
}