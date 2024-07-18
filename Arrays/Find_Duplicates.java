class Find_Duplicates
{
	public static void main(String[] args) {
		int arr[]={2,4,45,2,3,1,54,45};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(" Duplicates elements: "+  arr[j]+" present are at : " +(i+1)+" position and " + (j+1) +"Position");
				}
			}
		}
	}
}