class FindElement
{
	public static void main(String[] args) {
		int []num ={1,2,3,4,5,6,3,8};
		int findElement=3;
		boolean flag=true;

		for(int i=0;i<num.length;i++)
		{
			if(findElement==num[i])
			{
				System.out.println("Element found at position :"+(i+1));
				flag=false;
				break;

//
				
				
			}

		}
		if(flag)
		{
			System.out.println("Element not found");
		}
	}
}