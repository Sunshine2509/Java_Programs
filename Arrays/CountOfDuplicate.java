class CountOfDuplicate
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		}
		if(count==1)
		{
			System.out.println("There is only 1 element is duplicate ");
		}
		else if(count>1){
		System.out.println("There are " + count + " duplicate elements");
	}
	else {
		System.out.println(" There is no duplicates");
	}
	}
}