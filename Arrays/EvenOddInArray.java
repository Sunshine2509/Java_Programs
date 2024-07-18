class EvenOddInArray
{
	public static void main(String[] args) {
		int arr[]={4,5,6,8,21,0,35,5 };
		for (int i=1;i<arr.length;i++)
		{
			if (arr[i]%2==0)
				System.out.println(arr[i]);
		}
		}
}