import java.util.*;
class EvenOddArraySI
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		System.out.println("Enter Array Elements:");
		int a[]=new int[size];

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int evenCount=0;
		int oddCount=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		int evenArray[]=new int [evenCount];
		int oddArray[]=new int [oddCount];
		int itt1=0;
		int itt2=0;

		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			 {
				for(int j=0;j<evenArray.length;j++)
				{
					evenArray[j]=a[i];
					
					
			 	}
			 }
		 else 
				{
			 		for(int j=0;j<oddArray.length;j++)
			 	{
			 		oddArray[j]=a[i];

			 		}

			 	}
			//{

			// 	evenArray[itt1++]=a[j];
			// }
			// else 
			// {
			// 	oddArray[itt2++]=a[j];			
			// }
		}
			System.out.println(Arrays.toString(evenArray));
		System.out.println(Arrays.toString(oddArray));
		}

		
	}




