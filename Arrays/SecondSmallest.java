class SecondSmallest
{
	public static void main(String[] args) {
		int arr[] = { 3,9,1,2,11};
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
				if(arr[1]==arr[i])
				{
					System.out.println("Second Smallest element is "+ arr[i]+ " is at position "+ (i+1));
				}
			}
		}
	}
