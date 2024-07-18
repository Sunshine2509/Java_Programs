class LargestElement
{
	public static void main(String[] args) {
		int []a={2,3,5,7,-1,1};

		int largest=a[0];

		for(int i=0;i<a.length;i++)
		{
			

			if(a[i]>largest)
			{
				largest=a[i];
			}	
			

		}
		System.out.println(largest);
			
	}
}