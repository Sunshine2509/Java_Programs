class SmallestElementInArray
{
	public static void main(String[] args) {
		int []a={2,3,5,7,-1,1};

		int smallest=a[0];

		for(int i=0;i<a.length;i++)
		{
			

			if(a[i]<smallest)
			{
				smallest=a[i];
			}	
			

		}
		System.out.println(smallest);
			
	}
}